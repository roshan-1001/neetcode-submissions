class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        gr = [[1]*m]*n
        for i in range(1,n):
            for j in range(1,m):
                gr[i][j] = gr[i-1][j] + gr[i][j-1]
        
        return gr[n-1][m-1]