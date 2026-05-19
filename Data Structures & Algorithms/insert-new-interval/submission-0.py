class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        def merge(interval1, interval2):
            start1, end1 = interval1
            start2, end2 = interval2
            if start2<start1:
                start1,start2 = start2,start1
                end1,end2 = end2,end1
            if start2<=end1:
                return [[start1, max(end1,end2)]]
            else:
                return [[start1, end1], [start2, end2]]
        curr = newInterval
        res = []
        res.append(curr)
        for i in intervals:
            curr = res.pop()
            n = merge(curr,i)
            for m in n:
                res.append(m)
        return res
