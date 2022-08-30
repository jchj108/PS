package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNum_1920 {

    static int N;
    static int[] vals;
    static int[] findNums;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        findNums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            findNums[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        vals = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            vals[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(findNums);
        for (int i = 0; i < M; i++) {
            if(binarySearch(vals[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    private static boolean binarySearch(int vals) {
        int l = 0;
        int r = findNums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (findNums[mid] == vals) {
                return true;
            }
            if (findNums[mid] < vals) {
                l = mid + 1;
            }
            if (findNums[mid] > vals) {
                r = mid - 1;
            }
        }
        return false;
    }
}
