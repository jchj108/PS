package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NnM1 {

    static int[] res;
    static int N;
    static int M;
    static boolean[] visited = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        N = n;
        M = m;
        res = new int[m];

        dfs(1, 0);
    }

    private static void dfs(int i, int depth) {
        if (depth == M) {
            String s = "";
            for (int k : res) {
                s += String.valueOf(k) +" ";
            }
            System.out.println(s);
            return;
        }
        for (int j = 1; j <= N; j++) {
            if(!visited[j]) {
                visited[j] = true;
                res[depth] = j;
                dfs(j, depth + 1);
                visited[j] = false; // 자식 노드 탐색 후 방문 배열 변경
            }
        }
    }
}
