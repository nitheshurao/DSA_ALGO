package recursion;

public class Factorial {
    public static void main(String args[]) {
        System.out.println("factorial of 1 using recursion : " + factorial(1));
        System.out.println("factorial of 1 using iteration : " + factorial1(1L));
        System.out.println("factorial of 5 using recursion : " + factorial(5));
        System.out.println("factorial of 5 using loop : " + factorial1(5L));
        System.out.println("factorial of 7 using recursive algorithm : " + factorial(7));
        System.out.println("factorial of 7 using iterative algorithm : " + factorial1(7L));
    }

    public static long factorial(long l) {
        // base case - factorial of 0 or 1 is 1
        if (l <= 1) {
            return 1;
        }
        return l * factorial(l - 1);
    }

    public static long factorial1(long input) {
        long factorial = 1L;
        for (long i = input; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
