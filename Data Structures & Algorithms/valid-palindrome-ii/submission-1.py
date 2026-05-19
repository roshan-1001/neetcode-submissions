class Solution:
    def validPalindrome(self, s: str) -> bool:
        n = len(s)
        l = 0
        r = n-1
        count = 0
        def vp(s,l,r,count):
            if count == 2:
                return False
            if l>=r:
                return True
            
            if s[l]==s[r]:
                return vp(s,l+1,r-1,count)
            else:
                return vp(s,l+1,r,count+1) or vp(s,l,r-1,count+1)
        
        return vp(s,l,r,0)
        