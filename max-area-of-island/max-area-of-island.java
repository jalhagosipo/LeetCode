class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[0].length;j++) {
                if(grid[i][j] == 1 && visited[i][j] == 0) {
                    visited[i][j] = 1;
                    max = Math.max(checkIslandArea(i, j, 1, grid, visited), max);
                }
            }
        }
        return max;
    }

    private int checkIslandArea(int i, int j, int area, int[][] grid, int[][] visited) {
        int right = 0, left = 0, up = 0, down = 0;
        if(j + 1 < grid[0].length && grid[i][j + 1] == 1 && visited[i][j + 1] == 0) {
            visited[i][j + 1] = 1;
            right = checkIslandArea(i, j+1, 1, grid, visited);
        }
        if(j - 1 >= 0 && grid[i][j - 1] == 1 && visited[i][j - 1] == 0) {
            visited[i][j - 1] = 1;
            left = checkIslandArea(i, j-1, 1, grid, visited);
        }
        if(i + 1 < grid.length && grid[i + 1][j] == 1 && visited[i + 1][j] == 0) {
            visited[i + 1][j] = 1;
            up = checkIslandArea(i + 1, j, 1, grid, visited);
        }
        if(i - 1 >= 0 && grid[i - 1][j] == 1 && visited[i - 1][j] == 0) {
            visited[i - 1][j] = 1;
            down = checkIslandArea(i - 1, j, 1, grid, visited);
        }
        return area + right + left + up + down;
    }
}