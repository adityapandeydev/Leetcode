func reverse(x int) int {
    rev := 0

    for x != 0 {
        rem := x % 10
        rev = rev*10 + rem
        x /= 10
    }

    if rev < -(1<<31) || rev > (1<<31)-1 {
        return 0
    }

    return rev
}
