impl Solution {
    pub fn maximum_count(nums: Vec<i32>) -> i32 {
        let mut neg_count = 0;
        let mut i = 0;

        while i < nums.len() {
            if nums[i] < 0 {
                neg_count += 1;
            }
            if nums[i] > 0 {
                break;
            }
            i += 1;
        }

        neg_count.max((nums.len() - i) as i32)
    }
}