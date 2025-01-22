class Solution {
public:
    int lengthOfLastWord(string s) {
        s.erase(s.find_last_not_of(' ') + 1);
        int len = 0;
        for (int i = s.size() - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                return s.substr(i + 1).size();
            }
        }
        return s.size();
    }
};
