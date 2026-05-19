class Solution:
    def solve(self, board: List[List[str]]) -> None:
        n = len(board)
        m = len(board[0])
        
        def capture(i,j):
            if (i<0 or j<0 or i>=n or j>=m or board[i][j]!="O"):
                return
            board[i][j]="T"
            capture(i+1,j)
            capture(i-1,j)
            capture(i,j-1)
            capture(i,j+1)
        
        for c in range(m):
            if board[0][c] == "O":
                capture(0,c)
            if board[n-1][c]== "O":
                capture(n-1,c)
        for i in range(n):
            if board[i][0]=="O":
                capture(i,0)
            if board[i][m-1]=="O":
                capture(i,m-1)

        for i in range(n):
            for j in range(m):
                if board[i][j] == "O":
                    board[i][j] = "X"
                elif board[i][j]=="T":
                    board[i][j]="O"
        