package base;

public class ReverseString {
    public static void main(String[] args) {
        String res = reverseString("abcd");
        System.out.println(res);
    }

    private static String reverseString(String param) {
        char[] res = new char[param.length()];
        int j = param.length()-1;
        for (int i = 0; i < param.length() / 2; i++) {
            res[j] = param.charAt(i);
            res[i] = param.charAt(j--);
        }
        return new String(res);
    }
}
