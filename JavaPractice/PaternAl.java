
import java.util.Scanner;

class PaterAl {
    public static void main(String[] args) {
        // Take one input from user and print if it is a prime of not

        // Scanner scn = new Scanner(System.in);

        // System.out.println("Please Enter a number ::");
        // int n = scn.nextInt();
        // int I = 1;
        // // while (I <= n) {
        // // if (I == 5) {
        // // I++;
        // // continue;
        // // }
        // // System.out.println(I);

        // // I++;
        // // }
        // for (int j = 0; j < n; j++) {
        // if (j == 5) {
        // continue;
        // }
        // System.out.println(j);
        // }

        // strs = ["flower","flow","flight"]
        // String[] d ={"flower","flow","flight"};
        String str[] = new String[] { "fleower", "fleow", "flesight" };
        System.out.println(longestCommonPrefix(str));

    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        System.out.println("--1" + prefix);
        for (int i = 1; i < strs.length; i++) {
            System.out.println("--for--1" + i + "=" + prefix);
            while (strs[i].indexOf(prefix) != 0) {
                System.out.println("--!-0" + prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;

    }
}