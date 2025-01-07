impl Solution {
    pub fn find_median_sorted_arrays(nums1: Vec<i32>, nums2: Vec<i32>) -> f64 {
        let mut merged = Vec::new();
        let (mut i, mut j) = (0, 0);

        while i < nums1.len() && j < nums2.len() {
            if nums1[i] < nums2[j] {
                merged.push(nums1[i]);
                i += 1;
            } else {
                merged.push(nums2[j]);
                j += 1;
            }
        }
        merged.extend_from_slice(&nums1[i..]);
        merged.extend_from_slice(&nums2[j..]);

        let total_size = merged.len();
        if total_size % 2 == 0 {
            (merged[total_size / 2 - 1] as f64 + merged[total_size / 2] as f64) / 2.0
        } else {
            merged[total_size / 2] as f64
        }
    }
}
