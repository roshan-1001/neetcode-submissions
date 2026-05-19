class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        res = []
        curr = intervals[0]
        for i in intervals:
            if curr[1]>=i[0]:
                curr[1] = max(curr[1],i[1])
            else:
                res.append(curr)
                curr = i
        res.append(curr)
        return res