class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        return checkIdx(0,0, target, matrix, visited);
    }

    private boolean checkIdx(int i, int j, int target, int[][] matrix, boolean[][] visited) {
      if(matrix[i][j] == target) return true;
      boolean right = false, down = false;
      if(matrix.length > i + 1 && matrix[i+1][j] <= target) right = visited[i+1][j] ? false : this.checkIdx(i+1, j,target, matrix, visited);
      if(matrix[0].length > j + 1 && matrix[i][j+1] <= target) down = visited[i][j+1] ? false : this.checkIdx(i, j+1,target, matrix, visited);
      visited[i][j] = true;
      return right || down;
    }
}