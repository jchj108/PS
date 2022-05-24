package leetcode.fourteendays.bfs_dfs;

public class FloodFill {
    static int dc[] = {-1, 0, 1, 0};
    static int dr[] = {0, 1, 0, -1};

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int newColor, int currentColor) {
        image[sr][sc] = newColor;
        for(int i = 0; i < 4; i++) {
            int nextCol = sc + dc[i];
            int nextRow = sr + dr[i];

            if (!(nextRow >= image.length || nextRow < 0 || nextCol >= image[0].length || nextCol < 0)) {
                if(image[nextRow][nextCol] != newColor && image[nextRow][nextCol] == currentColor) {
                    dfs(image, nextRow, nextCol, newColor, currentColor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 2},
                {3, 4}
        };
        floodFill(image, 1, 1, 2);
    }
}
