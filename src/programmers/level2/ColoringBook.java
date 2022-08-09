package programmers.level2;

public class ColoringBook {

    static int[] dr;
    static int[] dc;
    static boolean[][] visited;
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int cnt;

    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        solution(m, n, picture);
    }

    public static int[] solution(int m, int n, int[][] picture) {
        // m = row
        // n = col
        visited = new boolean[m][n];
        dr = new int[]{0, -1, 0, 1};
        dc = new int[]{-1, 0, 1, 0};
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        cnt = 0;

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if(picture[i][j] != 0 && !visited[i][j]) {
                    cnt = 0;
                    dfs(i, j, picture[i][j], picture, m, n);
                    maxSizeOfOneArea = Math.max(cnt, maxSizeOfOneArea);
                    numberOfArea++;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    private static void dfs(int row, int col, int color, int[][] picture, int m, int n) {
        visited[row][col] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];

            if (validate(nextCol, nextRow, m, n) && !visited[nextRow][nextCol]
            && picture[nextRow][nextCol] == color) {
                dfs(nextRow, nextCol, picture[nextRow][nextCol], picture, m, n);
            }
        }
    }

    private static boolean validate(int nextCol, int nextRow, int m, int n) {

        if(nextCol < 0 || nextRow < 0 || nextCol >= n || nextRow >= m) {
            return false;
        }
        return true;
    }
}
