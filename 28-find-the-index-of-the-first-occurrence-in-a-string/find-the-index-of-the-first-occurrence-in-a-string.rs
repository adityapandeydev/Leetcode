impl Solution {
    pub fn str_str(haystack: String, needle: String) -> i32 {
        if let Some(pos) = haystack.find(&needle) {
            pos as i32
        } else {
            -1
        }
    }
}