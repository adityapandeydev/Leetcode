class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int i, negCount = 0; 
        for (i = 0; i < nums.size(); i++) {
            if (nums[i] < 0) {
                negCount++;
            }
            if (nums[i] > 0) {
                break;
            }
        }
        return negCount > (nums.size() - i) ? negCount : (nums.size() - i);
    }
};