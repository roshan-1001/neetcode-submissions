class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
       n = len(grid)
       m = len(grid[0])
       q = deque()
       for i in range(n):
            for j in range(m):
                if grid[i][j]==2:
                    q.append((i,j,0))
       time = 0
       while(q):
            a,b,t = q.popleft()
            time = max(time,t)
            directions = [(-1,0),(0,-1),(+1,0),(0,+1)]
            for dr,dc in directions:
                if 0<=a+dr<n and 0<=b+dc<m and grid[a+dr][b+dc]==1:
                    grid[a+dr][b+dc]=2
                    q.append((a+dr,b+dc,t+1))
       for i in range(n):
            for j in range(m):
                if grid[i][j]==1:
                    return -1
       return time