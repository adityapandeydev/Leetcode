import java.util.*;
class Solution {
    public int reverse(int x) {
        double rev, rem;
        rev = rem = 0;
        while(x != 0) {
            rem = x%10;
            rev = rev*10 + rem;
            x /= 10;
        }
        if (rev >= (Math.pow(-2,31)) && rev <= (Math.pow(2,31)-1)) {
            return (int)rev;
        }
        else {
            return 0;
        }
    }
}