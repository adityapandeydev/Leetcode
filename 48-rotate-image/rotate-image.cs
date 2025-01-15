public class Solution {
    public void Rotate(int[][] matrix) {
        int n = matrix.Length;
        for (int i = 0; i < n / 2; i++) {
            int last = n - 1 - i;
            for (int j = i; j < last; j++) {
                int help = j - i;
                int top = matrix[i][j];
                matrix[i][j] = matrix[last - help][i];
                matrix[last - help][i] = matrix[last][last - help];
                matrix[last][last - help] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
    }
}
