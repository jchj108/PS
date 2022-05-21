package leetcode.fourteendays.twopointer;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;

        for(int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // given an array non-decreasing
        int[] nums = {-5, -2, 1, 3, 4};
        nums = sortedSquares(nums);
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
