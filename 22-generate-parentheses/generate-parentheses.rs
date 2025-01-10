impl Solution {
    pub fn generate_parenthesis(n: i32) -> Vec<String> {
        let mut result = Vec::new();

        fn backtrack(result: &mut Vec<String>, current: String, open: i32, close: i32, max: i32) {
            if current.len() == (max * 2) as usize {
                result.push(current);
                return;
            }

            if open < max {
                backtrack(result, current.clone() + "(", open + 1, close, max);
            }

            if close < open {
                backtrack(result, current.clone() + ")", open, close + 1, max);
            }
        }

        backtrack(&mut result, String::new(), 0, 0, n);
        result
    }
}
