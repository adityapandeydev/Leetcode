class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int t = x;
        double rev;
        rev = 0;
        while (x>0) {
            rev = rev*10 + x%10;
            x /= 10;
        }
        if (rev >= (Math.pow(-2,31)) && rev <= (Math.pow(2,31)-1)) {
            rev = (int)rev;
            if (rev == t) {
                return true;
            }
        }
        return false;
    }
}