class Solution {
    public int[] findBall(int[][] grid) {
        int size = grid[0].length;
        int[] result = new int[size];
        for(int i = 0; i < size; i++) {
            result[i] = goToBottom(0, i, grid);
        }
        return result;
    }

    private int goToBottom(int x, int y, int[][] grid) {

        int cur = grid[x][y];
        if(cur == 1) {
            if(y + 1 > grid[0].length - 1) return -1;
            if(grid[x][y+1] == -1) return -1;
            if(x == grid.length - 1) return y+1;
            else return goToBottom(x+1, y+1, grid);
        } else {
            if(y - 1 < 0) return -1;
            if(grid[x][y-1] == 1) return -1;
            if(x == grid.length - 1) return y-1;
            else return goToBottom(x+1, y-1, grid);
        }
    }
}