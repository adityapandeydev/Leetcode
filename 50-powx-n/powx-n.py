class Solution:
    def myPow(self, x: float, n: int) -> float:
        ans = 1
        if n > 0:
            while n > 0:
                if n % 2 != 0:
                    ans *= x
                    n -= 1
                x *= x
                n //= 2
        else:
            while n != 0:
                if n % 2 != 0:
                    ans *= (1 / x)
                    n += 1
                x *= x
                n //= 2
        return ans
