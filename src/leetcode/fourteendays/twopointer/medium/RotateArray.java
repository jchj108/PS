package leetcode.fourteendays.twopointer.medium;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0) {
            return;
        }

        int l = 0;
        int r = nums.length;
        int rotate = r - k;
        int[] arr = nums.clone();

        while (l < r) {
            if(rotate >= nums.length) {
                rotate = rotate % nums.length;
            }

            nums[l] = arr[rotate];

            l++;
            rotate++;
        }
        for(int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums, 2);
    }
}
