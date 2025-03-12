public class Solution {
    public int MaximumCount(int[] nums) {
        int i, negCount = 0; 
        for (i = 0; i < nums.Length; i++) {
            if (nums[i] < 0) {
                negCount++;
            }
            if (nums[i] > 0) {
                break;
            }
        }
        return Math.Max(negCount, (nums.Length - i));
    }
}