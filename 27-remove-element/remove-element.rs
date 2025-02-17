impl Solution {
    pub fn remove_element(nums: &mut Vec<i32>, val: i32) -> i32 {
        let mut p = 0;
        for i in 0..nums.len() {
            if nums[i] != val {
                nums[p] = nums[i];
                p += 1;
            }
        }
        p as i32
    }
}
