# Recursion

### What is Recursion?
- A way of solving a problem by having function calling itself.

Login:
- A method calls itself exit from infinte loop.
- Perferming the same operation multiple time with differnts inputs
- In every step we try smaller inputs to make the problems smaller.
- Base condition is needed to step th recursion, otherwise infinite loop will occure.

```java
static  string reMethod(str[] par){
    if(exit from condtn satisfield ){
        return some vaue;
    }else{
         reMethod(Modifield par);
    }

}
```

### Fibonacci Numbe
The Nth Fibonacci Number can be found using the recurrence relation shown above:

if n = 0, then return 0. 
If n = 1, then it should return 1. 
For n > 1, it should return Fn-1 + Fn-2
```java
  public static void main(String[] args) throws Exception {
        int n = 3;
        System.out.println(
            n + "th Fibonacci Number: " + fib(n));
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
```

## Find the sum of digits of a +ve numbers using recusion?
- step 1:
```java
p int SumOdD(int n){
    if(n==0 ||n< 0){
        return 0;
    }
    return n%10 +SumOdD(n/10);
}
```
## The sum of a +ve int number

```java

    static int Power(int Base, int Exp ){
        if( Exp ==0){
            return 1;
        }
          if( Exp <1){
            return -1;
        }
        return Base*Power(Base, Exp-1);
    }
```

##  Greatest Common Division pf 2 number (GCD) ?

- GCD(48,18)
1. 48/18 = 2 rem =12

2. 18/12 = 1 rem =6

3. 12/6 = 2 rem =0


```java
As per the Euclidean Algorithm, GCF(X, Y) = GCF(Y, X mod Y)
where X > Y and mod is the modulo operator.

Here X = 48 and Y = 18

GCF(48, 18) = GCF(18, 48 mod 18) = GCF(18, 12)
GCF(18, 12) = GCF(12, 18 mod 12) = GCF(12, 6)
GCF(12, 6) = GCF(6, 12 mod 6) = GCF(6, 0)
GCF(6, 0) = 6 (∵ GCF(X, 0) = |X|, where X ≠ 0)
Therefore, the value of GCF of 18 and 48 is 6.

 static int GCD(int a, int b ){
    if(a< 0 || b <0){
        return -1;
    }
    if( b==0){ 
        return a;
    }

    return GCD(b, a%b);

  }

```
