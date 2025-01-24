class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int f = 1;
        int s = 2;
        int t = f + s;
        n -= 2;
        while(n > 0) {
            t = f + s;
            f = s;
            s = t;
            n--;
        }
        return t;
    }
}