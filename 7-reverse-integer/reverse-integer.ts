function reverse(x: number): number {
    let rev = 0;

    while (x !== 0) {
        const rem = x % 10;
        rev = rev * 10 + rem;
        x = Math.trunc(x / 10);
    }

    if (rev < -(2 ** 31) || rev > 2 ** 31 - 1) {
        return 0;
    }

    return rev;
}
