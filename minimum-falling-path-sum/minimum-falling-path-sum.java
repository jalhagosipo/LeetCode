class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int size = matrix.length;
        for(int i = 1; i<size;i++) {
            for(int j = 0; j<size;j++) {
                matrix[i][j] = Math.min(Math.min(
                        j-1 >= 0 ? matrix[i-1][j-1] : Integer.MAX_VALUE, matrix[i-1][j]),
                        j+1 < size ? matrix[i-1][j+1] : Integer.MAX_VALUE
                ) + matrix[i][j]; 
            }
        }
        int result = Integer.MAX_VALUE;
        for(int j = 0; j<size;j++) {
            result = result > matrix[size-1][j] ? matrix[size-1][j] : result; 
        }
        return result;
    }
}