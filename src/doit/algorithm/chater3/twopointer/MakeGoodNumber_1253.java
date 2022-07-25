package doit.algorithm.chater3.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakeGoodNumber_1253 {

    static int N;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        int cnt = getCnt();

        System.out.println(cnt);

    }

    private static int getCnt() {
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int k = nums[i];
            int l = 0;
            int r = nums.length - 1;

            while (l < r) {
                if (nums[l] + nums[r] == k) {
                    if (nums[l] != nums[r]) {
                        cnt++;
                        break;
                    }
                } else if (nums[l] + nums[r] < k) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return cnt;
    }
}
