class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = set()
        n = len(nums)
        def dfs(i,arr):
            if i>=n:
                res.add(tuple(arr))
                return
            arr.append(nums[i])
            dfs(i+1,arr)
            arr.pop()
            dfs(i+1,arr)
        
        nums.sort()
        dfs(0,[])
        result = [list(s) for s in res]
        return result
            