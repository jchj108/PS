package leetcode.leetcode75one;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abcccccdd";

        int res = longestPalindrome(s);
        System.out.println(res);
    }

    public static int longestPalindrome(String s) {

        int[] count = new int[128];
        int length = 0;
        for(char c: s.toCharArray()){
            if(++count[c] == 2){
                length += 2;
                count[c] = 0;
            }
        }
        return length == s.length() ? length: length+1;
    }
}
