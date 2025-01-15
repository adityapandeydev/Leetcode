/**
 * @param {number[][]} matrix
 * @return {void}
 */
var rotate = function(matrix) {
    const n = matrix.length;
    for (let i = 0; i < Math.floor(n / 2); i++) {
        const last = n - 1 - i;
        for (let j = i; j < last; j++) {
            const help = j - i;
            const top = matrix[i][j];
            matrix[i][j] = matrix[last - help][i];
            matrix[last - help][i] = matrix[last][last - help];
            matrix[last][last - help] = matrix[j][last];
            matrix[j][last] = top;
        }
    }
};
