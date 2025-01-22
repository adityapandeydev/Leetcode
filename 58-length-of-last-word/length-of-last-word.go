func lengthOfLastWord(s string) int {
    s = strings.TrimSpace(s)
    for i := len(s) - 1; i >= 0; i-- {
        if s[i] == ' ' {
            return len(s[i+1:])
        }
    }
    return len(s)
}
