class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        n = len(s)
        i=0
        j=0
        curr=0
        res=0
        my_map = {}
        while j<n:
            if s[j] in my_map:
                my_map[s[j]]+=1
            else:
                my_map[s[j]]=1
            curr = max(curr,my_map[s[j]])

            while(j-i+1) - curr >k:
                my_map[s[i]] -=1
                i += 1
            res = max(res, j-i+1)
            j+=1
        return res
        

