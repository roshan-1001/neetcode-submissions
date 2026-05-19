class Solution:
    def numDecodings(self, s: str) -> int:
        n = len(s)
        dp = [1]*n
        if s[0] == '0':
            return 0
        def dfs(i)-> int:
            if i == n:
                return 1
            if s[i]=='0':
                return 0
            res = dfs(i+1)
            if i<n-1 and s[i]== '1':
                res += dfs(i+2)
            elif i<n-1 and s[i] == '2' and (s[i+1]<'7'):
                res += dfs(i+2)
            dp[i] = res
            return res
        
        count = dfs(0)
        
        return count
