func addBinary(a string, b string) string {
    result := ""
    carry := 0
    i, j := len(a)-1, len(b)-1

    for i >= 0 || j >= 0 || carry > 0 {
        if i >= 0 {
            carry += int(a[i] - '0')
            i--
        }
        if j >= 0 {
            carry += int(b[j] - '0')
            j--
        }
        result = string(carry%2+'0') + result
        carry /= 2
    }

    return result
}
