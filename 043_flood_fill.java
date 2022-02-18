class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        int prev = image[sr][sc];
        floodFillUtil(image, sr, sc, newColor, prev);
        return image;
    }
    
    public void floodFillUtil(int[][] image, int sr, int sc, int newColor, int prev) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != prev) return;
        image[sr][sc] = newColor;
        floodFillUtil(image, sr+1, sc, newColor, prev);
        floodFillUtil(image, sr-1, sc, newColor, prev);
        floodFillUtil(image, sr, sc+1, newColor, prev);
        floodFillUtil(image, sr, sc-1, newColor, prev);
    }
}