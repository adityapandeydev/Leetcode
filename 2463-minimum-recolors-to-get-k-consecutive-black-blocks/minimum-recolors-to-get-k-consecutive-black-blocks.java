class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int currentCount = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentCount++;
            }
        }
        
        int minOperations = currentCount;
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                currentCount--;
            }
            
            if (blocks.charAt(i) == 'W') {
                currentCount++;
            }
            
            minOperations = Math.min(minOperations, currentCount);
        }
        
        return minOperations;
    }
}