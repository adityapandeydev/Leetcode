impl Solution {
    pub fn add_binary(a: String, b: String) -> String {
        let mut result = String::new();
        let mut carry = 0;
        let mut i = a.len() as isize - 1;
        let mut j = b.len() as isize - 1;

        while i >= 0 || j >= 0 || carry > 0 {
            if i >= 0 {
                carry += (a.as_bytes()[i as usize] - b'0') as i32; 
                i -= 1;
            }
            if j >= 0 {
                carry += (b.as_bytes()[j as usize] - b'0') as i32; 
                j -= 1;
            }
            result.push(((carry % 2) as u8 + b'0') as char);
            carry /= 2;
        }

        result.chars().rev().collect() 
    }
}
