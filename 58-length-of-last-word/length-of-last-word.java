class Solution {
    public int lengthOfLastWord(String s) {
        String rev = "";
        for(int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        rev = rev.trim();
        for(int i = 0; i < rev.length(); i++) {
            if(rev.charAt(i) == ' ') {
                rev = rev.substring(0, i);
                break;
            }
        }
        return rev.length();
    }
}