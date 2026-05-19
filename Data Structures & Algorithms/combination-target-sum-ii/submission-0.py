class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = set()
        candidates.sort()
        n = len(candidates)
        def dfs(i,currsum,l):
            
            if currsum == target:
                res.add(tuple(l))
            if i >=n or currsum>target:
                return
            l.append(candidates[i])
            dfs(i+1,currsum+candidates[i],l)
            l.pop()
            dfs(i+1,currsum,l)
        dfs(0,0,[])
        return [list(c) for c in res]