package leetcode.graph;

public class NumbersOfIslands {

    static int[] dY = {-1, 1, 0, 0};
    static int[] dX = {0, 0, -1, 1};

    public static int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '0') {
                    dfs(i, j, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void dfs(int y, int x, char[][] grid) {
        grid[y][x] = '0'; // check visited
        for (int i = 0; i < 4; i++) {
            int nextY = y + dY[i];
            int nextX = x + dX[i];
            if (nextY < 0 || nextY > grid.length - 1 || nextX < 0 || nextX > grid[0].length - 1) {
                continue;
            }
            if (grid[nextY][nextX] == '0') {
                continue;
            }
            dfs(nextY, nextX, grid);
        }
    }

    public static void main(String[] args) {

        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int res = numIslands(grid);
        System.out.println(res);

    }
}
