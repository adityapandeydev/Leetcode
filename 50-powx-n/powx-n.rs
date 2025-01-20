impl Solution {
    pub fn my_pow(x: f64, n: i32) -> f64 {
        let mut ans = 1.0;
        let mut x = x;
        let mut n = n;
        if n > 0 {
            while n > 0 {
                if n % 2 != 0 {
                    ans *= x;
                    n -= 1;
                }
                x *= x;
                n >>= 1;
            }
        } else {
            while n != 0 {
                if n % 2 != 0 {
                    ans *= 1.0 / x;
                    n += 1;
                }
                x *= x;
                n >>= 1;
            }
        }
        ans
    }
}
