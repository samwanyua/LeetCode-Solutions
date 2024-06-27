class Solution:
    def mySqrt(self, x):
        left, right = 0, x
        result = 0

    # Binary search
        while left <= right:
            m = left + ((right - left ) // 2) # same as left + right // 2
            if m**2 > x:
                right = m -1
            elif m**2 < x:
                left = m + 1
                result = m
            else:
                return m
        return result


        