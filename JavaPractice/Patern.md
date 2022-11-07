















### Char Paterns
Please Enter a number ::
4
A
AB
ABC
ABCD
```js

   System.out.print((char) ('A' + j - 1));
   
```
Qs:

input:Please Enter a number ::
4
o/p:

ABCD
BCDE
CDEF
DEFG


```js
 int k = 0;
        while (I <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print((char) ('A' + j + k - 1));

                j++;

            }
            k++;
            System.out.println();

            I++;
        }

        ------------or--------------
         while (I <= n) {
            int j = 1;
            char stgchr = (char) ('A' + I - 1);
            while (j <= n) {
                System.out.print(stgchr);
                stgchr = (char) (stgchr + 1);

                j++;

            }
            k++;
            System.out.println();

            I++;
        }
```


### Start Patern

-Please Enter a number ::
4
- o/p
   *
  **
 ***
****

```js
 int n = scn.nextInt();
        int I = 1;
        while (I <= n) {
            int j = 1;
            while (j<= I) {

                System.out.print('_');
                j++;
            }
            j = 1;
            while (j <= I) {

                System.out.print('*');
                j++;
            }

            System.out.println();

            I++;
        }

```

# Invert Trangle
Please Enter a number ::
4
****
***
**
*
```js

 while (j <= n - I+1) {

                System.out.print('*');
                j++;
            }
```

- Please Enter a number ::
4
_****
__***
___**
____*

```js
  while (I <= n) {
            int j = 1;
            while (j <= n-I) {

                System.out.print('_');
                j++;
            }
            j=1;
            while (j <= n - I+1) {

                System.out.print('*');
                j++;
            }
            // j = 1;
            // while (j <= I) {

            // System.out.print('*');
            // j++;
            // }

            System.out.println();

            I++;
        }
    
```

## 4.Isosceles Triangle.m4v

- Please Enter a number ::
4
____1
___121
__12321
_1234321

```js
 while (I <= n) {
            int j = 1;
            while (j <= n - I + 1) {

                System.out.print('_');
                j++;
            }
            j = 1;
            while (j <= I) {

                System.out.print(j);
                if (j == I) {
                    for (int k = j - 1; k >= 1; k--) {
                        System.out.print(k);
                    }
                }
                j++;
            }
            // j = 1;
            // while (j <= I) {

            // System.out.print('*');
            // j++;
            // }

            System.out.println();

            I++;
        
    

```