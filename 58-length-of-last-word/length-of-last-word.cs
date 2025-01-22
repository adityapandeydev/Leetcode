public class Solution {
    public int LengthOfLastWord(string s) {
        s = s.Trim();
        for (int i = s.Length - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                return s.Substring(i + 1).Length;
            }
        }
        return s.Length;
    }
}
