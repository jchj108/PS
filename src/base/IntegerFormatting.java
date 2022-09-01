package base;

public class IntegerFormatting {

    public static void main(String[] args) {
        String res = formatting(1234567);

    }

    private static String formatting(int number) {
        String temp = "";
        int cnt = 0;
        String formatted = "";
        String res = "";
        while (number != 0) {
            if (cnt == 2) {
                temp = "," + String.valueOf(number % 10);
                cnt = 0;
            } else {
                cnt++;
                temp = String.valueOf(number % 10);
            }
            res = temp + res;
            number /= 10;
        }
        System.out.println(res);
        return res;
    }


}
