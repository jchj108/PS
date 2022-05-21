package leetcode.fourteendays;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        int result = searchInsert(nums, target);
        System.out.println(result);

    }

    public static int searchInsert(int[] nums, int target) {

        int pl = 0;
        int pr = nums.length - 1;
        int pc = 0;

        while (pl <= pr) {
            pc = (pl + pr) / 2;

            if(nums[pc] == target) {
                return pc;
            } else if (nums[pc] < target) {
                pl = pc + 1;
            } else if (nums[pc] > target) {
                pr = pc - 1;
            }
        }
        return Math.max(pl,pr);

    }
}
