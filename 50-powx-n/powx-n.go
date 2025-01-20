func myPow(x float64, n int) float64 {
    ans := 1.0
    if n > 0 {
        for n > 0 {
            if n%2 != 0 {
                ans *= x
                n--
            }
            x *= x
            n = n >> 1
        }
    } else {
        for n != 0 {
            if n%2 != 0 {
                ans *= (1 / x)
                n++
            }
            x *= x
            n = n >> 1
        }
    }
    return ans
}
