package study;

public class Test {

    public static void main(String[] args) {

//        String res = reverseString("asdfasdasdzx");
//        System.out.println(res);

        int[] arr = {1, 11, 20, 21, 24, 30};
        int closestValue = findClosestValue(arr, 23);
        System.out.println(closestValue);
    }

    private static int findClosestValue(int[] arr, int value) {
        int l = 0;
        int r = arr.length;
        int near = Integer.MAX_VALUE;

        while (l <= r) {
            int c = (l + r) / 2;
            if (arr[c] == value) {
                return arr[c];
            }
            if (arr[c] > value) {
                r = c - 1;
            }
            if (arr[c] < value) {
                l = c + 1;
            }
        }

        int lowD = Math.abs(value - arr[l]);
        int highD = Math.abs(arr[r] - value);

        return lowD > highD ? arr[r] : arr[l];
    }

    private static String reverseString(String input) {
        char[] arr = input.toCharArray();
        int r = input.length()-1;

        for (int i = 0; i < input.length() / 2; i++) {
            arr[i] = input.charAt(r);
            arr[r--] = input.charAt(i);
        }

        return new String(arr);
    }
}
