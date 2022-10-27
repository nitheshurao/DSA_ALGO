import recursion.Factorial;

public class App {
    public static void main(String[] args) throws Exception {

        // Factorial recursion = new Factorial();
        // var rec = Factorial.factorial(5l);
        // System.out.println(rec);
        System.out.println("factorial of 5 using loop : " + Factorial.factorial(5l));

    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}