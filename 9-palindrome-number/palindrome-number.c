#include <stdbool.h>
#include <math.h>
#include <limits.h>

bool isPalindrome(int x) {
    if (x < 0) {
        return false;
    }

    int original = x;
    long rev = 0;

    while (x > 0) {
        rev = rev * 10 + x % 10;
        x /= 10;
    }

    if (rev > INT_MAX) {
        return false;
    }

    return (int)rev == original;
}
