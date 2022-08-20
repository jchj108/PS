package programmers.leetcode.easy;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int r = String.valueOf(x).length() - 1;

        for(int i = 0; i < String.valueOf(x).length(); i++) {
            char lc = s.charAt(i);
            char rc = s.charAt(r--);

            if(lc != rc) {
                return false;
            }
        }

        return true;
    }
}