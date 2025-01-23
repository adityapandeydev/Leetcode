char* addBinary(char* a, char* b) {
    int lenA = strlen(a), lenB = strlen(b);
    int maxLen = lenA > lenB ? lenA : lenB;
    char* result = (char*)malloc(maxLen + 2); // +2 for carry and null terminator
    int carry = 0, k = 0;

    lenA--; lenB--;
    while (lenA >= 0 || lenB >= 0 || carry) {
        if (lenA >= 0) carry += a[lenA--] - '0';
        if (lenB >= 0) carry += b[lenB--] - '0';
        result[k++] = (carry % 2) + '0';
        carry /= 2;
    }
    result[k] = '\0';
    for (int i = 0, j = k - 1; i < j; i++, j--) {
        char temp = result[i];
        result[i] = result[j];
        result[j] = temp;
    }
    return result;
}
