
import java.util.Scanner;

class PaterAl {
    public static void main(String[] args) {
        // Take one input from user and print if it is a prime of not

        Scanner scn = new Scanner(System.in);

        System.out.println("Please Enter a number ::");
        int n = scn.nextInt();
        int I = 1;
        while (I <= n) {
            int j = 1;
            while (j <= n - I + 1) {

                System.out.print('_');
                j++;
            }
            j = 1;
            while (j <= n) {
                if (j <= I) {
                    System.out.print(j);
                }
                // else {
                // System.out.print(I);
                // }
                // System.out.print(j);
                // if (j == I) {
                // for (int k = j - 1; k >= 1; k--) {
                // System.out.print(k);
                // }
                // }
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
    }
}