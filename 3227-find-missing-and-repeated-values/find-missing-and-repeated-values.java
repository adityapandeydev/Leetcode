class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int len = grid.length;
        for (int i = 1; i <= (len * len); i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(grid[i][j])) {
                    map.put(grid[i][j], map.get(grid[i][j]) + 1);
                }
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 2) {
                ans[0] = i;
            }
            if (map.get(i) == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}