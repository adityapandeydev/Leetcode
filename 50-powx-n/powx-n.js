/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    let ans = 1;
    if (n > 0) {
        while (n > 0) {
            if (n % 2 !== 0) {
                ans *= x;
                n--;
            }
            x *= x;
            n = n >> 1;
        }
    } else {
        while (n !== 0) {
            if (n % 2 !== 0) {
                ans *= (1 / x);
                n++;
            }
            x *= x;
            n = n >> 1;
        }
    }
    return ans;
};
