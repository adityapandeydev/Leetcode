int removeElement(int* nums, int numsSize, int val) {
    int p = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums[p] = nums[i];
            p++;
        }
    }
    return p;
}
