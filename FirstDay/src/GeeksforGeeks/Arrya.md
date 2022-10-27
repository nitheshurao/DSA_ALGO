### [Peak element](https://practice.geeksforgeeks.org/problems/peak-element/1)

An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 
Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.

stn:1
``` js
/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }
}
```

``` js

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] nums,int n)
    {
        int i = 0, j = n-1;
        while(i < j){
            int mid = (i+j)/2;
            
            if(mid+1 < n && nums[mid] <= nums[mid+1])
                i = mid+1;
            else
                j = mid;
        }
        return i;
    }
}
```
-------
```js
 {
        int i;
        for (i = 0; i < n-1; i++)   
        {  
            if(arr[i]>arr[i+1])
            {
                return i;
            }
        }
    return i;
        
    }
```