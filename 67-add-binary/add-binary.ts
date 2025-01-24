function addBinary(a: string, b: string): string {
    let result: string[] = [];
    let carry: number = 0;
    let i: number = a.length - 1;
    let j: number = b.length - 1;

    while (i >= 0 || j >= 0 || carry) {
        if (i >= 0) carry += parseInt(a[i--]);
        if (j >= 0) carry += parseInt(b[j--]);
        result.push((carry % 2).toString());
        carry = Math.floor(carry / 2);
    }

    return result.reverse().join('');
}
