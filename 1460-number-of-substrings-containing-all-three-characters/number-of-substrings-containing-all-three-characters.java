class Solution {
    public int numberOfSubstrings(String s) {
        int len = 0;
        int res = 0;
        char[] count = new char[3];
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i) - (int) 'a';
            count[temp] += 1;
            while (count[0] != 0 && count[1] != 0 && count[2] != 0) {
                res += s.length() - i;
                temp = (int) s.charAt(len) - (int) 'a';
                count[temp] -= 1;
                len += 1;
            }
        }
        return res;
    }
}