package leetcode.fourteendays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int result = search(nums, target);
    }

    public static int search(int[] nums, int target) {

        Arrays.sort(nums);

        int pl = 0;
        int pr = nums.length - 1;

        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            if (nums[pc] == target) {
                return pc;
            } else if (nums[pc] < target) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        return -1;
    }
}
