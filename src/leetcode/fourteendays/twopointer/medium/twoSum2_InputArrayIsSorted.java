package leetcode.fourteendays.twopointer.medium;

import java.util.HashMap;
import java.util.Map;

public class twoSum2_InputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement)+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        return new int[]{l + 1, r + 1};
    }

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        int result[] = twoSum(numbers, target);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
