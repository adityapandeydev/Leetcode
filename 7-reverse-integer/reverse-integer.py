class Solution:
    def reverse(self, x: int) -> int:
        rev = 0

        while x != 0:
            rem = x % 10
            if x < 0 and rem > 0:
                rem -= 10
            rev = rev * 10 + rem
            x = (x - rem) // 10

        if rev < -2**31 or rev > 2**31 - 1:
            return 0

        return rev
