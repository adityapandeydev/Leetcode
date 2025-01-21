func spiralOrder(matrix [][]int) []int {
    result := []int{}
    if len(matrix) == 0 || len(matrix[0]) == 0 {
        return result
    }

    top, left := 0, 0
    bottom, right := len(matrix)-1, len(matrix[0])-1

    for top <= bottom && left <= right {
        for i := left; i <= right; i++ {
            result = append(result, matrix[top][i])
        }
        top++

        for i := top; i <= bottom; i++ {
            result = append(result, matrix[i][right])
        }
        right--

        if top <= bottom {
            for i := right; i >= left; i-- {
                result = append(result, matrix[bottom][i])
            }
            bottom--
        }

        if left <= right {
            for i := bottom; i >= top; i-- {
                result = append(result, matrix[i][left])
            }
            left++
        }
    }

    return result
}
