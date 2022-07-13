package doit.algorithm.chater3.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jumong_1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int cnt = 0;
        int sum = 0;

        while (l < r) {
            sum = nums[l] + nums[r];
            if (sum == m) {
                cnt++;
                l++;
                r--;
            } else if (sum < m) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(cnt);
    }
}
