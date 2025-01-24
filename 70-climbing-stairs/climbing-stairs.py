import math

class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        sqrt5 = math.sqrt(5)
        phi = (1 + sqrt5) / 2
        psi = (1 - sqrt5) / 2
        return int((phi**(n + 1) - psi**(n + 1)) / sqrt5)
