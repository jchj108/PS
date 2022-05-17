package programmers.leetcode.fourteendays.twopointer;

public class moveZeros {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int count = 0 ,n =nums.length,i =0 ;

        for( i =0;i< n;i++){
            if(nums[i] != 0){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp ;
                count++;
            }

        }

        for(int num : nums) {
            System.out.println(num);
        }

        return;

    }
}
