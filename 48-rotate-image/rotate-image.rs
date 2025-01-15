impl Solution {
    pub fn rotate(matrix: &mut Vec<Vec<i32>>) {
        let n = matrix.len();
        for i in 0..n / 2 {
            let last = n - 1 - i;
            for j in i..last {
                let help = j - i;
                let top = matrix[i][j];
                matrix[i][j] = matrix[last - help][i];
                matrix[last - help][i] = matrix[last][last - help];
                matrix[last][last - help] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
    }
}
