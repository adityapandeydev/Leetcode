class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        neg_count = 0
        i = 0

        while i < len(nums):
            if nums[i] < 0:
                neg_count += 1
            if nums[i] > 0:
                break
            i += 1

        return max(neg_count, len(nums) - i)