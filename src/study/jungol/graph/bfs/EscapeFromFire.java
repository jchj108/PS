package study.jungol.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EscapeFromFire {
    static char[][] map;
    static boolean[][] visited;
    static int row;
    static int col;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<Dot> queue = new LinkedList<>();

    private static class Dot {
        char val;
        int row;
        int col;
        int cnt;

        public Dot(int row, int col, char val, int cnt) {
            this.val = val;
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new char[row][col];
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                map[i][j] = c;
            }
        }

        outer :
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'S') {
                    queue.add(new Dot(i, j, map[i][j], 0));
                    visited[i][j] = true;
                    break outer;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '*') {
                    queue.add(new Dot(i, j, map[i][j], -1));
                    visited[i][j] = true;
                }
            }
        }

        int res = bfs();
        System.out.println(res);

    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            Dot cur = queue.poll();
            visited[cur.row][cur.col] = true;

            if (cur.val == 'D') {
                return cur.cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nextCol = dx[i] + cur.col;
                int nextRow = dy[i] + cur.row;

                if (nextRow < map.length && nextRow >= 0 && nextCol < map[0].length && nextCol >= 0) {
                    if (cur.cnt == -1) {
                        if ((map[nextRow][nextCol]) == '.' && !visited[nextRow][nextCol]) {
                            queue.add(new Dot(nextRow, nextCol, map[nextRow][nextCol], -1));
                        }
                    } else {
                        if ((map[nextRow][nextCol] == '.' || map[nextRow][nextCol] == 'D') && !visited[nextRow][nextCol]) {
                            queue.add(new Dot(nextRow, nextCol, map[nextRow][nextCol], cur.cnt + 1));
                        }
                    }
                }
            }
        }
        return -1;
    }
}
