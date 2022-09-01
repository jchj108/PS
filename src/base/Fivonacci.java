package base;

public class Fivonacci {

    public static void main(String[] args) {
        int res = fivonacci(10);
        System.out.println(res);
    }

    private static int fivonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fivonacci(i-1) + fivonacci(i-2);
    }
}
