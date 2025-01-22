class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                len = s.substring(i, s.length() - 1).length();
                return len;
            }
        }
        return s.length();
    }
}