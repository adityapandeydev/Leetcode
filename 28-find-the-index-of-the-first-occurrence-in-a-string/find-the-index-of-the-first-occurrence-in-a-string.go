func strStr(haystack string, needle string) int {
    if len(needle) == 0 {
        return 0
    }
    index := strings.Index(haystack, needle)
    if index != -1 {
        return index
    } else {
        return -1
    }
}