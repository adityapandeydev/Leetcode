int maximumCount(int* nums, int numsSize) {
    int i, negCount = 0; 
    for (i = 0; i < numsSize; i++) {
        if (nums[i] < 0) {
            negCount++;
        }
        if (nums[i] > 0) {
            break;
        }
    }
    return negCount > (numsSize - i) ? negCount : (numsSize - i);
}