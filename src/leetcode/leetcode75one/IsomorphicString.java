package leetcode.leetcode75one;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";

        boolean res = IsomorphicString.isIsomorphic(s, t);
        System.out.println(res);

    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<Character, Character>();


        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) == b) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
