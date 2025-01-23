impl Solution {
    pub fn generate_matrix(n: i32) -> Vec<Vec<i32>> {
        let n = n as usize;
        let mut matrix = vec![vec![0; n]; n];
        let mut num = 1_i32;
        let mut top: isize = 0;
        let mut left: isize = 0;
        let mut bottom: isize = (n as isize) - 1;
        let mut right: isize = (n as isize) - 1;

        while num <= (n * n) as i32 {
            for i in left..=right {
                matrix[top as usize][i as usize] = num;
                num += 1;
            }
            top += 1;
            for i in top..=bottom {
                matrix[i as usize][right as usize] = num;
                num += 1;
            }
            right -= 1;
            for i in (left..=right).rev() {
                matrix[bottom as usize][i as usize] = num;
                num += 1;
            }
            bottom -= 1;
            for i in (top..=bottom).rev() {
                matrix[i as usize][left as usize] = num;
                num += 1;
            }
            left += 1;
        }

        matrix
    }
}
