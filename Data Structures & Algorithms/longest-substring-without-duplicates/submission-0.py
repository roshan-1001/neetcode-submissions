class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        i=0
        curr = 0
        mymap = {}
        for j in range(n) :
            if s[j] in mymap and mymap[s[j]]>=i:
                i = mymap[s[j]]+1
            mymap[s[j]]=j
            curr = max(curr,j+1-i)
        return curr

