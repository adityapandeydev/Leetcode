/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let result = [];
    let carry = 0;
    let i = a.length - 1, j = b.length - 1;

    while (i >= 0 || j >= 0 || carry) {
        if (i >= 0) carry += parseInt(a[i--]);
        if (j >= 0) carry += parseInt(b[j--]);
        result.push(carry % 2);
        carry = Math.floor(carry / 2);
    }

    return result.reverse().join('');
};
