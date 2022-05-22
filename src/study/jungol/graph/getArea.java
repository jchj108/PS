package study.jungol.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class getArea {
    static int m, n, k;
    static boolean[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new boolean[m][n];
        visited = new boolean[m][n];

        for (int l = 0; l < k; l++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int i = y1; i < y2; i++) {
                for (int j = x1; j < x2; j++) {
                    map[i][j] = true;
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!map[i][j] && !visited[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
    private static void dfs(int y, int x) {
        visited[y][x] = true;
        cnt++;

        for(int i = 0; i < 4; i++) {
           int nextX = x + dx[i];
           int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= n || m <= nextY) {
                continue;
            }
            if(!map[nextY][nextX] && !visited[nextY][nextX]) {
                dfs(nextY, nextX);
            }

        }
    }
}
