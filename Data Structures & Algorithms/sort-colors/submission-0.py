class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        a = nums.count(0)
        b = nums.count(1)
        c = nums.count(2)
        for i in range(a):
            nums[i] = 0
        for i in range(a,a+b):
            nums[i] = 1
        for i in range(a+b,a+b+c):
            nums[i] = 2
        return