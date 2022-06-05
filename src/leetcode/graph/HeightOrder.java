package leetcode.graph;

import java.util.Scanner;

public class HeightOrder {
    static boolean[][] g, rg;
    static boolean[] visited, rvisited;
    static int cnt, ans, n, m;

    // (나보다 키가 작은 사람 + 나보다 키가 큰 사람) == n - 1 이면 내 키 순서를 알 수 있다

    static void dfs(int now) {
        cnt++;
        visited[now] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && g[now][i])
                dfs(i);
        }
    }

    static void rdfs(int now) {
        cnt++;
        rvisited[now] = true;
        for (int i = 1; i <= n; i++) {
            if (!rvisited[i] && rg[now][i])
                rdfs(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 개수
        m = sc.nextInt(); // 간선의 개수

        g = new boolean[n + 1][n + 1];
        rg = new boolean[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a][b] = true;
            rg[b][a] = true;
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            rvisited = new boolean[n + 1];
            cnt = 0;
            dfs(i);
            rdfs(i);
            if (cnt == n + 1) ans++;
        }
        System.out.println(ans);
    }
}
