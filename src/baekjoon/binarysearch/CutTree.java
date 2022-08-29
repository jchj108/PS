package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CutTree {

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int r = 0;
        int l = 0;
        for (int i : list) {
            r = Math.max(r, i);
        }

        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            long remainder = 0;
            for (int i : list) {
                remainder += (i - mid) < 0 ? 0 : (i - mid);
            }
            if (remainder < M) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(l-1); // upperbound 이므로 l-1해주기 (이미 1증가했으니까)
    }
}
