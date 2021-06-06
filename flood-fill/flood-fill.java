class Solution {
     boolean[][] isFloodFill;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        isFloodFill = new boolean[image.length][image[0].length];
        isFloodFill[sr][sc] = true;
        int targetColor = image[sr][sc];
        image[sr][sc] = newColor;
        checkFlood(image, sr-1, sc, newColor, targetColor);
        checkFlood(image, sr+1, sc, newColor, targetColor);
        checkFlood(image, sr, sc-1, newColor, targetColor);
        checkFlood(image, sr, sc+1, newColor, targetColor);
        return image;
    }

    private void checkFlood(int[][] image, int sr, int sc, int newColor, int targetColor) {
        boolean isValidIndex = !(sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0);
        if(isValidIndex && image[sr][sc] == targetColor && !isFloodFill[sr][sc]) {
            image[sr][sc] = newColor;
            isFloodFill[sr][sc] = true;
            checkFlood(image, sr-1, sc, newColor, targetColor);
        checkFlood(image, sr+1, sc, newColor, targetColor);
        checkFlood(image, sr, sc-1, newColor, targetColor);
        checkFlood(image, sr, sc+1, newColor, targetColor);
        }
    }
}