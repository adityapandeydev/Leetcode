impl Solution {
    pub fn length_of_last_word(s: String) -> i32 {
        let trimmed = s.trim();
        let mut length = 0;

        for c in trimmed.chars().rev() {
            if c == ' ' {
                break;
            }
            length += 1;
        }
        length
    }
}
