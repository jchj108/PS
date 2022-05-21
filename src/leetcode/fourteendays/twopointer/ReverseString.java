package leetcode.fourteendays.twopointer;

public class ReverseString {
    public static void main(String[] args) {

        reverseString("asdfe".toCharArray());
    }

    public static void reverseString(char[] s) {
        // Reverse String with O(n) space complexity
        for(int i = 0, r = s.length-1; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[r];
            s[r] = temp;
            r--;
        }
    }
}
