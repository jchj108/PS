package leetcode.fourteendays.twopointer;

public class moveZeros {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        // moves Zero to right without making new instance
        int count = 0, n = nums.length;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
