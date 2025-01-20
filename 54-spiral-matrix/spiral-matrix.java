class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return list;
        int top = 0, left = 0;
        int bottom = matrix.length - 1, right = matrix[0].length - 1;
        while(top <= bottom && left <= right) {
            int i;
            for (i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (i = top; i <= bottom; i++)
                list.add(matrix[i][right]);
            right--;
            if (top <= bottom) {
                for (i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}