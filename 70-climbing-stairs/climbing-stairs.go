func climbStairs(n int) int {
    sqrt5 := math.Sqrt(5)
    phi := (1 + sqrt5) / 2
    psi := (1 - sqrt5) / 2
    result := (math.Pow(phi, float64(n + 1)) - math.Pow(psi, float64(n + 1))) / sqrt5
    return int(math.Round(result))
}