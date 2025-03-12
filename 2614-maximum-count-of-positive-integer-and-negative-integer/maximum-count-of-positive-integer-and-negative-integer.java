class Solution {
    public int maximumCount(int[] nums) {
        int i, negCount = 0; 
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negCount++;
            }
            if (nums[i] > 0) {
                break;
            }
        }
        return Math.max(negCount, (nums.length - i));
    }
}