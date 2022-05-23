package programmers.leetcode.easy;

public class ReverseWordsInString3 {
    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuffer res = new StringBuffer();

        for(int i = 0; i < words.length; i++) {
            res.append(new StringBuffer(words[i]).reverse().append(" "));
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
