"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        arrs = list()
        arre = list()
        for i in intervals:
            arrs.append(i.start)
            arre.append(i.end)
        arrs.sort()
        arre.sort()
        count = 0
        res=0
        n = len(intervals)
        s,e=0,0
        while(s<n):
            if arrs[s]<arre[e]:
                s+=1
                count+=1
            else:
                e+=1
                count-=1
            res = max(res,count)
        return res
