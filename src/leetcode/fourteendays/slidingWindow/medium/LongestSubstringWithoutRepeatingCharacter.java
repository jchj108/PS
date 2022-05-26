package leetcode.fourteendays.slidingWindow.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<Character>();
        while (l < s.length()) {
            if (r >= s.length()) {
                break;
            }
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                max = Math.max(set.size(), max);
                r++;
            } else {
                l++;
                r = l;
                set.clear();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("aab");
        System.out.println(result);
    }
}
