class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, left = 0;
        int bottom = n - 1, right = n - 1;
        while (num <= n * n) {
            int i;
            for (i = left; i <= right; i++)
                matrix[top][i] = num++;
            top++;
            for (i = top; i <= bottom; i++)
                matrix[i][right] = num++;
            right--;
            for (i = right; i >= left; i--)
                matrix[bottom][i] = num++;
            bottom--;
            for (i = bottom; i >= top; i--)
                matrix[i][left] = num++;
            left++;
        }
        return matrix;
    }
}