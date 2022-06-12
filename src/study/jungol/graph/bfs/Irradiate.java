package study.jungol.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Irradiate {

    static int map[][];
    static int x, y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int cnt = 3;
    static int remain = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken()); // col
        y = Integer.parseInt(st.nextToken()); // row

        map = new int[y][x];

        for (int i = 0; i < y; i++) {
            String s = br.readLine().trim();
            for (int j = 0; j < x; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        st = new StringTokenizer(br.readLine());
        int startY = Integer.parseInt(st.nextToken());
        int startX = Integer.parseInt(st.nextToken());
        bfs(startY, startX);

        System.out.println(cnt);

        for (int[] arr : map) {
            for (int x : arr) {
                if (x != 0) {
                    remain++;
                }
            }
        }
        System.out.println(remain);
    }

    private static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{y, x, cnt});
        map[y][x] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int count = cur[2];

            for (int i = 0; i < 4; i++) {
                int nextY = cur[0] + dy[i];
                int nextX = cur[1] + dx[i];

                if (nextX < 0 || nextY < 0 || nextY >= map.length || nextX >= map[0].length) {
                    continue;
                }

                if (map[nextY][nextX] != 0) {
                    queue.add(new int[]{nextY, nextX, count+1});
                    map[nextY][nextX] = 0;
                    cnt = Math.max(count - 1, cnt);
                }
            }
        }
    }
}
