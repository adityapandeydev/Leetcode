function maximumCount(nums: number[]): number {
    let negCount = 0;
    let i: number;

    for (i = 0; i < nums.length; i++) {
        if (nums[i] < 0) {
            negCount++;
        }
        if (nums[i] > 0) {
            break;
        }
    }

    return Math.max(negCount, nums.length - i);
};