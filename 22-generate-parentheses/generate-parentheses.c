/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void backtrack(char **result, int *returnSize, char *current, int open, int close, int max) {
    if (strlen(current) == max * 2) {
        result[*returnSize] = (char *)malloc((max * 2 + 1) * sizeof(char));
        strcpy(result[*returnSize], current);
        (*returnSize)++;
        return;
    }

    if (open < max) {
        int len = strlen(current);
        current[len] = '(';
        current[len + 1] = '\0';
        backtrack(result, returnSize, current, open + 1, close, max);
        current[len] = '\0';
    }

    if (close < open) {
        int len = strlen(current);
        current[len] = ')';
        current[len + 1] = '\0';
        backtrack(result, returnSize, current, open, close + 1, max);
        current[len] = '\0';
    }
}

char **generateParenthesis(int n, int *returnSize) {
    *returnSize = 0;
    int maxCombinations = 1 << (2 * n);
    char **result = (char **)malloc(maxCombinations * sizeof(char *));
    char *current = (char *)malloc((2 * n + 1) * sizeof(char));
    current[0] = '\0';

    backtrack(result, returnSize, current, 0, 0, n);

    free(current);
    return result;
}
