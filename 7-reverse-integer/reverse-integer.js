/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let rev = 0;

    while (x !== 0) {
        const rem = x % 10;
        rev = rev * 10 + rem;
        x = (x / 10) | 0;
    }

    if (rev < -(2 ** 31) || rev > 2 ** 31 - 1) {
        return 0;
    }

    return rev;
};
