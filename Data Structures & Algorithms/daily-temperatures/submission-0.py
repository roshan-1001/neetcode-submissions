class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res = [0]*n
        for i in range(0,n-1,1):
            j=i+1
            print(j)
            while j<n and not temperatures[j]>temperatures[i]:
                j+=1
            print(j)
            if j<n:
                res[i]=j-i
                
        return res