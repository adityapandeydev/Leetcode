class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[][] matrix = {{1, 1}, {1, 0}};
        int[][] result = matrixPower(matrix, n - 2); 
        return result[0][0] * 2 + result[0][1];
    }

    private int[][] matrixPower(int[][] matrix, int n) {
        int[][] result = {{1, 0}, {0, 1}}; 
        while (n > 0) {
            if (n % 2 == 1) {
                result = multiplyMatrices(result, matrix);
            }
            matrix = multiplyMatrices(matrix, matrix);
            n /= 2;
        }
        return result;
    }

    private int[][] multiplyMatrices(int[][] a, int[][] b) {
        return new int[][]{
            {a[0][0] * b[0][0] + a[0][1] * b[1][0], a[0][0] * b[0][1] + a[0][1] * b[1][1]},
            {a[1][0] * b[0][0] + a[1][1] * b[1][0], a[1][0] * b[0][1] + a[1][1] * b[1][1]}
        };
    }
}
