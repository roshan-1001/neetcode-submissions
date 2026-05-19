class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        n = len(nums)
        nums.sort()
        for i in range(0,n-2,1):
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # skip duplicate i
            j = i+1
            k = n-1
            while j<k:
                if nums[i]+nums[j]+nums[k]==0:
                    res.append([nums[i],nums[j],nums[k]])
                    while j<k and nums[j+1]==nums[j]: 
                        j+=1
                    while j<k and nums[k-1] == nums[k]:
                        k-=1
                    j+=1
                    k-=1
                elif nums[i]+nums[j]+nums[k]<0:
                    j+=1
                else:
                    k-=1
        return res
        
