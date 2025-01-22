#include <string.h>

int lengthOfLastWord(char *s) {
    int len = strlen(s);
    while (len > 0 && s[len - 1] == ' ') len--; 
    int result = 0;
    for (int i = len - 1; i >= 0; i--) {
        if (s[i] == ' ') {
            return result;
        }
        result++;
    }
    return result;
}
