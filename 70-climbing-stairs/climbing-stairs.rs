impl Solution {
    pub fn climb_stairs(n: i32) -> i32 {
        let sqrt5 = 5.0_f64.sqrt();
        let phi = (1.0 + sqrt5) / 2.0;
        let psi = (1.0 - sqrt5) / 2.0;
        ((phi.powi(n + 1) - psi.powi(n + 1)) / sqrt5).round() as i32
    }
}