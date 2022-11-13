### 13. Roman to Integer (https://leetcode.com/problems/roman-to-integer/)
- left to right
- if i> i+1;
add i+(i+1)
else i+(i+1)



```js
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> ap = new HashMap<>();
        ap.put('I',1);
        ap.put('V',5);
        ap.put('X',10);
        ap.put('L',50);
        ap.put('C',100);
        ap.put('D',500);
        ap.put('M',1000);

int result = ap.get(s.charAt( s.length()-1));
for( int i= s.length()-2; i>=0;i--){
    if(ap.get(s.charAt(i))< ap.get(s.charAt(i+1))){
        result -= ap.get(s.charAt(i));
    }
    else{
        result += ap.get(s.charAt(i));
    }
} 
return result ;

        
    }
}

```

### 14. Longest Common Prefix (https://leetcode.com/problems/longest-common-prefix/)

-  Working:
- - 1)Take the first(index=0) string in the array as prefix. 
 String prefix = strs[0];
- - 2)Iterate from second(index=1) string till the end.
```js 
for(int index=1;index<strs.length;index++){
    
```
- 3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
```js           
 while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
```

- 4)Use the substring function to chop the last letter from prefix each time the function return -1.




### . 


```js


lass Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char element : chars) {
            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
                continue;
            } else if (stack.empty()) {
                return false;
            }
            char top = stack.pop();
            if (top == '(' && element != ')') {
                return false;
            } else if (top == '[' && element != ']') {
                return false;
            } else if (top == '{' && element != '}') {
                return false;
            }
        }
        return stack.empty();
    }
}

```

#### 125. Valid Palindrome

- Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

steps: 
- Removing all the non-Alphanumeric characters & Converting All UpperCase character to lowercase	

- //we are comparing First and last index character of string e.g "racecar" -->first index char is 'r' and last index char is also 'r' which is equal 
    //now from first index+1 to last index-1 i.e. "aceca" recursion will handle or give us the answer
	//if the characters are not equal e.g "abcecb" first index char is 'a' which is not equal to last index char i.e. 'b' simply return false
```js
class Solution {
    public boolean isPalindrome(String s) {
 s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

    //    for( int i=0;i< s.length()-1;i++){
    //         if( s.charAt(i) !=s.charAt(s.length()-i-1) ){
    //             return false;
    //         }
    //     }
    //     return true;
   return isPA(s,0, s.length()-1);


    }

    private boolean isPA(String s, int f, int l){
        if( f>=l){
            return true;
        }
        if(s.charAt(f)!=s.charAt(l))
            return false;

	 return isPA(s,f+1,l-1);
    }
}

```

### 171. Excel Sheet Column Number
 - A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

```js

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch : columnTitle.toCharArray()) {
          
            int diff = ch - ('A' - 1);
            sum = sum * 26 + diff;
        }
        return sum;
    }
}
```


### 


```js
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        
        }

char[] ar = s.toCharArray();
Arrays.sort(ar);
String s1 = String.valueOf(ar);
char[] ar1 = t.toCharArray();
Arrays.sort(ar1);
String t1 = String.valueOf(ar1);

boolean isN= true;
    for( int i=s1.length()-1; i>=0;i--){
        // s.charAt(i);
        if(s1.charAt(i) != t1.charAt(i)){
           isN =false;
        }
    }
    return isN;
        
    }
}
```

```js
int a=s.length();
        int b=t.length();
        
        if(a!=b){
            return false;
        }
        
        int[] arr=new int[26];
        
        for(int i=0;i<a;i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            arr[index]++;
        }
        for(int i=0;i<b;i++){
            char ch=t.charAt(i);
            int index=ch-'a';
            arr[index]--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;


        -------------------------============
        public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        if (!Arrays.equals(charsS, charsT)) return false;
        return true;
    }

```