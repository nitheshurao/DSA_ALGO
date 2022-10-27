package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcdefg";
        String ans = "";
        System.out.println(reverse(s, ans, s.length() - 1));
    }

    static String reverse(String s, String ans, int l) {
        if (l < 0)
            return ans;
        ans = ans + s.charAt(l);
        return reverse(s, ans, l - 1);
    }
}
