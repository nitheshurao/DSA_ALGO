### [1. Two Sum](https://leetcode.com/problems/two-sum/)
-

```js
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result; 
    }
}
```

### [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)

``` js

class Solution {
    public int removeDuplicates(int[] nums) {
    //   nums = [1,1,2]
        int j = 1; 
        for (int i = 0; i < nums.length - 1; i++) {
            // 0,1==1[j]=2
            if(nums[i] != nums[i+1]){. //nu[1]!=nu[]2]
                nums[j++] = nums[i+1];  //nu[1]=2
            }
        }
        return j;

    }
        
    
}
```