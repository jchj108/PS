package leetcode.leetcode75one;

public class IsSubSequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        boolean res = isSubsequence(s, t);
        System.out.println(res);
    }

    public static boolean isSubsequence(String s, String t) {

        boolean[] arr = new boolean[s.length()];

        int idx = 0;
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            if(idx > arr.length - 1) {
                continue;
            }

            if (c == s.charAt(idx)) {
                arr[idx] = true;
                idx++;
            }
        }
        for (boolean b : arr) {
            if (b == false) {
                return false;
            }
        }
        return true;
    }

}
