package study.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class getArea {

    static int m, n, k;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        boolean[][] map = new boolean[n][m];
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
        for(boolean[] bool : map) {
            for(boolean boo : bool) {
                System.out.print(boo);
            }
            System.out.println();
        }
    }

}
