package leetcode.leetcode75one;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningSum(nums);

        for (int i : nums) {
            System.out.println(i);
        }

    }

    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
