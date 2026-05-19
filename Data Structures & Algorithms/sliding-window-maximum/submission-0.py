class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res = []
        n = len(nums)
        for i in range(0,n-k+1,1):
            cset = set(nums[i:i+k])
            res.append(max(cset))
        return res