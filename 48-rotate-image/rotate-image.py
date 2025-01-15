class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        for i in range(n // 2):
            last = n - 1 - i
            for j in range(i, last):
                help = j - i
                top = matrix[i][j]
                matrix[i][j] = matrix[last - help][i]
                matrix[last - help][i] = matrix[last][last - help]
                matrix[last][last - help] = matrix[j][last]
                matrix[j][last] = top