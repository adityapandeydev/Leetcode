function spiralOrder(matrix: number[][]): number[] {
    const result: number[] = [];
    if (!matrix || matrix.length === 0 || matrix[0].length === 0)
        return result;

    let top = 0, left = 0;
    let bottom = matrix.length - 1, right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
        for (let i = left; i <= right; i++) 
            result.push(matrix[top][i]);
        top++;

        for (let i = top; i <= bottom; i++) 
            result.push(matrix[i][right]);
        right--;

        if (top <= bottom) {
            for (let i = right; i >= left; i--) 
                result.push(matrix[bottom][i]);
            bottom--;
        }

        if (left <= right) {
            for (let i = bottom; i >= top; i--) 
                result.push(matrix[i][left]);
            left++;
        }
    }

    return result;
}
