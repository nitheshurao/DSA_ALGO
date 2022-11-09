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



### 58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.




```js
class Solution {
    public int lengthOfLastWord(String s) {
        String[] output = s.split(" ");
        return output[output.length-1].length();
    }
}
```


```js
-14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

/*
PLEASE UPVOTE IF IT HELPS YOU! THANK YOU!
Recommend to dry run along with the example.

Working:
1)Take the first(index=0) string in the array as prefix.
2)Iterate from second(index=1) string till the end.
3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
4)Use the substring function to chop the last letter from prefix each time the function return -1.

eg:
strs=["flower", "flow", "flight"]
prefix=flower
index=1
    while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flower")!=0)
    Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe"
    Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flowe")!=0)
    Since flowe as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flow"
    Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flow")!=0)
    Since flow as a whole is in flow, it returns 0 so now prefix=flow
index=2
    while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flow")!=0)
    Since flow as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flo"
    Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flo")!=0)
    Since flo as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "fl"
    Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("fl")!=0)
    Since fl as a whole is in flight, it returns 0 so now prefix=fl
index=3, for loop terminates and we return prefix which is equal to fl
*/
```


### sqr(https://leetcode.com/problems/sqrtx/)

```js

class Solution {
    public int mySqrt(int n) {
         long lo=0,hi=n;
        long ans=0;
        while(lo<=hi)
        {
            long mid=(lo+hi)/2;
            if(mid*mid<n)
            {
                lo=mid+1;
                //mid*mid chota hai to usko equal laane ke lie lo ko badhao
                ans=mid;
            }
            else if(mid*mid>n) hi=mid-1;
            else return (int)mid;
        }
        return (int)ans;
    }
}



----
my solution :
class Solution {
public int mySqrt(int x) {
x=(int)Math.sqrt(x);
int res = (int)Math.floor(x);
return res;
}
}


```