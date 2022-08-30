package base;

public class ReverseNumber {

    public static void main(String[] args) {

        int res =  reverseNumber(1234);
        System.out.println(res);
    }

    private static int reverseNumber(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int reverse2(int x) { // x = -1234
        int rev = 0;

        while(x>9 || x<-9) {
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev*10+x; // -4321
    }
}
