/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    for (let i = s.length - 1; i >= 0; i--) {
        if (s[i] === ' ') {
            return s.substring(i + 1).length;
        }
    }
    return s.length;
};
