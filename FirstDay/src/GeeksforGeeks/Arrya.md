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




```js
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
          int mid = (low+high)/2;
          if(nums[mid]==target) return mid;
          else if(nums[mid]>target){
            high = mid-1;
          }else
             low = mid+1;
        }
        return low;
    }
}
```



plus one:


best soltn:-----

```js
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
		// starting from extreme right--> if array[i] is less than 9 means can be added with 1
		// i.e. [ 5,8 ]-->[ 5,9 ] or
		//      [ 9,4 ]-->[ 9,5 ] or
		//      [ 6,0 ]-->[ 6,1 ]
		// and will directly return array
	}
	digits[i] = 0;
	// if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
	// and we again revolve around loop to check for number if less than 9 or not
	// i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
	//      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
	// and will directly return array
}

// if all number inside array are 9
// i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


// to make like above we need to make new array of length--> n+1
// by default new array values are set to -->0 only
// thus just changed first value of array to 1 and return the array

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
```

sl2:
```js
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        int length = digits.length;
        while(length>0 && digits[length-1]==9){
            digits[length-1]=0;
            length--;
        }
        if(length<=0){
            int arr[] = new int[digits.length+1];
            Arrays.fill(arr,0);
            arr[0]=1;
            return arr;
        }else{
            digits[length-1]++;
            return digits;
        }
    }
```

### 88. Merge Sorted Array

```js
 public void merge(int[] nums1, int m, int[] nums2, int n) {
    int c = 0;
        while (m < nums1.length) {
            nums1[m++] = nums2[c++];
        }
        Arrays.sort(nums1);
    }
```



``` js
public static int palinArray(int[] a, int n)
           {
                  //add code here.
                      for(int i=0;i<n;i++) {
                      int num=0, N=a[i];
                      while(N!=0) {
                          num = (num*10) + N%10;
                          N = N/10;
                      }
                      if(num != a[i]) {
                          return 0;
                      }
                  }
                  return 1;
           }
```


- Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
```js


class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
       boolean startindex= true;
        boolean endindex= true;
        int[] arr= new int[2];
        int start=-1;
        int end=-1;
        
        for(int i=0;i<N;i++){
            if(a[i]==key&&startindex){
                start=i;
                startindex=false;
            }
            if(a[i]==key&&!startindex){
                end=i;
                endindex=false;
            }
        }
        arr[0]=start;
        arr[1]=end;
        
        return arr;
        
    }
}
```


```js

class Solution {
    boolean fascinating(long n) {
        // code here
        
     long tm=n*2;
        long thm=n*3;
        String a=String.valueOf(n)+String.valueOf(tm)+String.valueOf(thm);
        char[] ch=a.toCharArray();
        Arrays.sort(ch);
        a=new String(ch);
        
        String s2="123456789";
        
        if(a.equals(s2)){
            return true;
        }
        
        return false;
    }
}

```