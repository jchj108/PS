package leetcode.leetcode75one;

public class FindPivotIndex {


    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};
        int res = pivotIndex(nums);
        System.out.println(res);
    }

    public static int pivotIndex(int[] nums) {

        int sum = 0, leftSum = 0;

        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (sum - leftSum - nums[i])) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
