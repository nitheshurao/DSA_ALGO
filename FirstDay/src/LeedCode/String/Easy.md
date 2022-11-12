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