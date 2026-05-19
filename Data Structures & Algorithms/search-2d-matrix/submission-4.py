class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        lr = 0
        rr = m-1
        if target<matrix[0][0] or target>matrix[m-1][n-1]:
            return False
        while lr<=rr:
            row = lr + ((rr-lr)//2)
            if target>=matrix[row][0] and target<=matrix[row][-1]:
                break
            elif target>matrix[row][n-1]:
                lr = row+1
            elif target<matrix[row][0]:
                rr = row-1
        if not(lr<=rr):
            return False
        lr = row
        l,r = 0,n-1
        while l<=r:
            q = l+((r-l)//2)
            if target>matrix[lr][q]:
                l=q+1
            elif target<matrix[lr][q]:
                r=q-1
            else:
                return True
        return False
            
            