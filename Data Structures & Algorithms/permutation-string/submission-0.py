class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n =  len(s1)
        ss1 = sorted(s1)
        m = len(s2)
        for i in range(n-1,m,1):
            sstring = s2[i-n+1:i+1]
            ss2 = sorted(sstring)
            print(ss2)
            if ss1==ss2:
                return True
        print(ss1)
        
        return False
            
