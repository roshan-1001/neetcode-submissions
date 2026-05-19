class Solution:
    def findMin(self, nums: List[int]) -> int:
        n = len(nums)
        l,r = 0,n-1
        if nums[0]<nums[n-1]:
            return nums[0]
        while(l<=r):
            mid = (l+r)//2
            if(nums[mid]>nums[l]):
                l = mid
            elif(nums[mid]<nums[r]):
                r = mid
            else:
                print(mid)
                if mid+1 == n:
                    return nums[0]
                else:
                    return nums[mid+1]
            