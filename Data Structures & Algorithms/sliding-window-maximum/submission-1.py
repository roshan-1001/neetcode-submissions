class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        dq = deque()
        res = []
        for i in range(len(nums)):
            if dq and i-k+1>dq[0]:
                dq.popleft()

            while dq and nums[dq[-1]]<nums[i]:
                dq.pop()
            
            dq.append(i)

            if i>=k-1:
                res.append(nums[dq[0]])
        return res