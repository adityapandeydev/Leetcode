function generateParenthesis(n: number): string[] {
    const result: string[] = [];

    const backtrack = (current: string, open: number, close: number, max: number) => {
        if (current.length === max * 2) {
            result.push(current);
            return;
        }

        if (open < max) backtrack(current + "(", open + 1, close, max);
        if (close < open) backtrack(current + ")", open, close + 1, max);
    };

    backtrack("", 0, 0, n);
    return result;
}
