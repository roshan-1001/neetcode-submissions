class Solution:
    def isHappy(self, n: int) -> bool:
        reqset = set()
        while(n!=1):
            curr = 0
            while(n!=0):
                curr += (n%10)**2
                n = n//10
            if curr in reqset:
                return False
            reqset.add(curr)
            n = curr
        return True