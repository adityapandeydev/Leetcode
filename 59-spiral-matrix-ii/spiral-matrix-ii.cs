public class Solution {
    public int[][] GenerateMatrix(int n) {
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = new int[n];
        }
        int num = 1, top = 0, left = 0, bottom = n - 1, right = n - 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++)
                matrix[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++)
                matrix[i][right] = num++;
            right--;
            for (int i = right; i >= left; i--)
                matrix[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--)
                matrix[i][left] = num++;
            left++;
        }
        return matrix;
    }
}