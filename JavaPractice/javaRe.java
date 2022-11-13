// import recursion.Factorial;

public class javaRe {
    public static void main(String[] args) throws Exception {

        // Factorial recursion = new Factorial();
        // var rec = Factorial.factorial(5l);
        // System.out.println(rec);
        // System.out.println("factorial of 5 using loop : " +
        // Factorial.factorial(5l));

        System.out.println(titleToNumber("BA"));

    }

    // public int fibonacci(int n) {
    // if (n < 0) {
    // return -1;
    // }
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            System.out.println("--" + columnTitle.charAt(i));

            int diff = columnTitle.charAt(i) - 64;
            System.out.println("--d" + diff + ('A' - 1) + columnTitle.charAt(i));
            sum = sum * 26 + diff;
        }
        return sum;
    }

}
