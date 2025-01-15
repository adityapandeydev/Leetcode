func rotate(matrix [][]int) {
    n := len(matrix)
    for i := 0; i < n/2; i++ {
        last := n - 1 - i
        for j := i; j < last; j++ {
            help := j - i
            top := matrix[i][j]
            matrix[i][j] = matrix[last-help][i]
            matrix[last-help][i] = matrix[last][last-help]
            matrix[last][last-help] = matrix[j][last]
            matrix[j][last] = top
        }
    }
}
