


<div id="header" display="flex" >
<h1> Recursion</h1>
A function or method is said to be Recursion if it calls itself.
</div>

### Steps to solve a problem using Recursion
<p> Once you have identified that a coding problem can be solved using Recursion, You are just two steps away from writing a recursive function.<p>

- 1.  Find the base case
- 2.  Finding how to call the method and what to do with the return value.
- -----------------------------------------------------------------------
### Factorial of a given number in Java, using both recursion and iteration.
## !n = n*(n-1)*(n-2).....*1

- In order to create a recursive solution, you would need a base case where the program terminates and repetition stops.  In this problem, the base case is factorial of 1, which is 1 so when your function calls factorial(1) you can simply return 1 without doing any calculation. 
- base case - factorial of 0 or 1 is 1 
- Factorial using recursion
if(number <=1){ return 1; } 
return number*factorial(number - 1);

- Factorial without Recursion
long factorial = 1L; 
for(long i= input; i > 0; i--){ 
    factorial = factorial * i; 
    }
     return factorial;
- -----------------------------------------------------------------------
### Fibonacci series in Java
<a>Fibonacci series is a series of natural numbers where the next number is equivalent to the sum of the previous two numbers like fn = fn-1 + fn-2. The first two numbers of the Fibonacci series are always 1, 1.</a>

