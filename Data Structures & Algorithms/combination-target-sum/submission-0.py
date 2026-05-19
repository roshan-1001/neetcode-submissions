class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        n = len(nums)
        res = []
        def dfs(i,currsum,l):
            if i >=n:
                return
            elif currsum == target:
                res.append(l.copy())
                return
            elif currsum > target:
                return
            l.append(nums[i])
            dfs(i, currsum + nums[i],l)
            l.pop()
            dfs(i+1,currsum,l)
        dfs(0,0,[])
        return res
            
