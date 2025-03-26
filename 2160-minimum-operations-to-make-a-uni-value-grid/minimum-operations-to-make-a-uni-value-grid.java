import java.util.Arrays;

public class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] values = new int[m * n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                values[idx++] = grid[i][j];
            }
        }
        
        int remainder = values[0] % x;
        for (int val : values) {
            if (val % x != remainder) {
                return -1; 
            }
        }
        
        for (int i = 0; i < values.length; i++) {
            values[i] -= remainder;
        }
        
        Arrays.sort(values);
        
        int median = values[values.length / 2];
        int operations = 0;
        
        for (int val : values) {
            operations += Math.abs(val - median) / x;
        }
        
        return operations;
    }
}
