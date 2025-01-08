impl Solution {
    pub fn reverse(x: i32) -> i32 {
        let mut rev: i64 = 0;
        let mut x = x as i64;

        while x != 0 {
            let rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }

        if rev < i32::MIN as i64 || rev > i32::MAX as i64 {
            return 0;
        }

        rev as i32
    }
}
