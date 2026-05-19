class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def par(res: List[str], curr:str, op: int,close:int,count:int, countmax:int):
            if count==countmax:
                res.append(curr)
                return
            if op<countmax/2:
                par(res,curr+'(',op+1,close,count+1,countmax)
            if close<op:
                par(res,curr+')',op,close+1,count+1,countmax)
            return
        res = []
        curr = ''
        par(res,curr,0,0,0,n*2)
        return res