```js
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String WEIRD = "Weird";
        String NOT_WEIRD = "Not Weird";
        String numberType = "";
        int N = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N % 2 != 0)
            numberType = WEIRD;
        else {
            
            if (N >= 2 && N <= 5)
                numberType = NOT_WEIRD;
            else if (N >= 6 && N <= 20)
                numberType = WEIRD;
            else
                numberType = NOT_WEIRD;
        }
        
        System.out.print(numberType); // Just one STDOUT, see? Cleaner.
       
        scanner.close();
    }
}
```



```js

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int i = scan.nextInt();
         double d = scan.nextDouble();
    
    scan.nextLine();
    String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
```


```js
   Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    System.out.println(A.length() + B.length());
    if (A.compareTo(B) > 0){
        System.out.println("Yes");
    }
    else{
    System.out.println("No");
}
    System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+ " " +B.substring(0, 1).toUpperCase()+B.substring(1));
}
```


# Java Substring Comparisons


using list and hashset
```js

port java.util.Scanner; import java.util.*; public class Solution {

public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    Set<String> set = new HashSet<String>(); 
    for(int i=0; i<s.length(); i++){
        if(s.substring(i).length()>=3){
            set.add(s.substring(i).substring(0, 3));
        }
    }
    List<String> list = new ArrayList<String>(set);
    Collections.sort(list);
    smallest = list.get(0);
    largest = list.get(list.size()-1);
    return smallest + "\n" + largest;
}


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
}
```

without using hashset



```js

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // First, we settle default value to variable smallest to compare
        // no need to do this with largest value, as it will be already
        // too small to be overwritten by another value.
        smallest = s.substring(0, k);
        
        // Now we start comparing and replacing values
        for (int i = 0; i <= s.length() - k; i++){
            
            // logic is that if substring is smallest than smallest var
            // then we save that value on smallest var
            if (s.substring(i, i + k).compareTo(smallest) <= 0)
                smallest = s.substring(i, i + k);
                
            // logic is that if substring is larger than larger var
            // then we save that value on largest var
            if (s.substring(i, i + k).compareTo(largest) >= 0)
                largest = s.substring(i, i + k);
        } 
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
```

using compare:

```js

public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for(int i=0;i<=s.length()-k;i++){
            if((s.substring(i,i+k).compareTo(smallest))<=0){
                smallest = s.substring(i,i+k);
            }
            if((s.substring(i, i+k).compareTo(largest))>=0){
                largest = s.substring(i, i+k);
            }
        }
        return smallest + "\n" + largest;
    }
```