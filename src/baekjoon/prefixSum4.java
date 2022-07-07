package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prefixSum4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N+1];
        int[] sums = new int[N+1];

        st = new StringTokenizer(br.readLine());
        StringBuilder res = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            sums[i] = nums[i] + sums[i - 1];
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            res.append(sums[end] - sums[start-1]);
            res.append("\n");
        }
        System.out.println(res.toString());
    }
}
