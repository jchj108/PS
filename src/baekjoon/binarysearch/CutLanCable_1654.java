package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutLanCable_1654 {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        long[] cables = new long[N];

        for (int i = 0; i < N; i++) {
            cables[i] = Integer.parseInt(br.readLine());
        }

        long l = 0;
        long r = 0;
        for (long i : cables) {
            r = Math.max(r, i);
        }

        long res = search(cables, l, r+1); //
        System.out.println(res);


    }

    private static long search(long[] cables, long l, long r) {
        while (l < r) {
            long mid = (l + r) / 2;
            int remain = 0;
            for (long cable : cables) {
                remain += cable / mid;
            }
            if (remain < M) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l - 1;
    }
}
