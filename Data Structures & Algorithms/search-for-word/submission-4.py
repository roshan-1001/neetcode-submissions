class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        r = len(board)
        c = len(board[0])
        def check(i,j,string,tr):
            if i<0 or i>=r or j<0 or j>=c:
                return False
            if string[0] != board[i][j]:
                return False
            if (i,j) in tr:
                return False
            tr.add((i,j))
            
            if len(string)==1 and board[i][j] == string[0]:
                return True
            n = len(string)
            currstring = string[1:]
            found = (check(i,j+1,currstring, tr) or check(i,j-1,currstring, tr) or check(i-1,j,currstring, tr) or check(i+1,j,currstring, tr))
            tr.remove((i,j))
            return found

        for i in range(r):
            for j in range(c):
                track = set()
                if check(i,j,word,track)==True:
                    return True
        return False



