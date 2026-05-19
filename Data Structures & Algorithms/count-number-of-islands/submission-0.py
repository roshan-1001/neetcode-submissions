class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        n = len(grid)
        m = len(grid[0])
        def dfs(i,j):
            grid[i][j]="0"
            if i+1<n and grid[i+1][j]== "1":
                dfs(i+1,j)
            if j+1<m and grid[i][j+1]=="1":
                dfs(i,j+1)
            if i-1>=0 and grid[i-1][j]=="1":
                dfs(i-1,j)
            if j-1>=0 and grid[i][j-1]=="1":
                dfs(i,j-1)
            return
        count = 0
        for a in range(n):
            for b in range(m):
                if grid[a][b]=="1":
                    dfs(a,b)
                    count +=1
        return count