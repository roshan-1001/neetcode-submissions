class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        maxarea = 0
        n = len(grid)
        m = len(grid[0])
        def dfs(i,j):
            nonlocal area
            grid[i][j]=0
            if i+1<n and grid[i+1][j]== 1:
                dfs(i+1,j)
                area+=1
            if j+1<m and grid[i][j+1]==1:
                dfs(i,j+1)
                area+=1
            if i-1>=0 and grid[i-1][j]==1:
                dfs(i-1,j)
                area+=1
            if j-1>=0 and grid[i][j-1]==1:
                dfs(i,j-1)
                area+=1
            return
        count = 0
        for a in range(n):
            for b in range(m):
                area = 0
                if grid[a][b]==1:
                    area = 1
                    dfs(a,b)
                    count +=1
                maxarea = max(area,maxarea)
        return maxarea