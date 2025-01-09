impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        if x < 0 {
            return false;
        }

        let original = x as i64;
        let mut rev: i64 = 0;
        let mut x = x as i64;

        while x > 0 {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        rev == original
    }
}
