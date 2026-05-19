class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pref=[1]*n
        suf=[1]*n
        
        pref[0]=1;
        suf[n-1]=1;
        pref[1]= nums[0]
        suf[n-2]= nums[n-1]
        for i in range(1,n,1):
            pref[i] = pref[i-1]*nums[i-1]
        res = [1]*n
        for i in range(n-2,-1,-1):
            suf[i] = suf[i+1]*nums[i+1]
        for i in range(0,n,1):
            res[i]=pref[i]*suf[i]

        return res