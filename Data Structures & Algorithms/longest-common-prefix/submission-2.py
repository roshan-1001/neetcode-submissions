class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        i = 0
        flag = 1
        while(flag):
            for s in strs:
                if i>=len(s):
                    flag = 0
                    break
                elif s[i]!= strs[0][i]:
                    flag = 0
                    break
            i+=1
        return strs[0][0:i-1]
        
