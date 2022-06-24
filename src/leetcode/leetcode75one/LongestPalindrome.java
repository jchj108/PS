package leetcode.leetcode75one;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abcccccdd";

        int res = longestPalindrome(s);
        System.out.println(res);
    }

    public static int longestPalindrome(String s) {

        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
