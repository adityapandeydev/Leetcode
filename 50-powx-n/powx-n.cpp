class Solution {
public:
    double myPow(double x, int n) {
        double ans = 1;
        if (n > 0) {
            while (n > 0) {
                if (n % 2 != 0) {
                    ans = ans * x;
                    n--;
                }
                x = x * x;
                n = n >> 1;
            }
        } else {
            while (n != 0) {
                if (n % 2 != 0) {
                    ans = ans * (1 / x);
                    n++;
                }
                x = x * x;
                n = n >> 1;
            }
        }
        return ans;
    }
};
