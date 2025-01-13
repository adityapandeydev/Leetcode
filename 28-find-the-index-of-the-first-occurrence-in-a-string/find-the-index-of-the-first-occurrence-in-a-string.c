int strStr(char* haystack, char* needle) {
    char* pos = strstr(haystack, needle);
    if(pos != NULL) {
        return pos - haystack;
    } else {
        return -1;
    }
}