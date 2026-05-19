from math import sqrt
class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        res = []
        n = len(points)
        for i in points:
            d = sqrt(i[0]**2 +i[1]**2)
            res.append([d,i[0],i[1]])
        res.sort(key= lambda x:x[0])
        result = []
        for j in range(k):
            result.append(res[j][1:3])
        return result