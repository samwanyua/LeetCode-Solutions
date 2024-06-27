class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        countS, countT = {}, {} # create hashmaps
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)

        for c in countS:
            if countS[c] != countT.get(c,0): # .get(c,0) to avoid key error if the key doesn't exist. 0 is the default value
                return False
        return True

        # optimized solution
        return sorted(s) == sorted(t)

        # Shortcut
        return Counter(s) == Counter(t)