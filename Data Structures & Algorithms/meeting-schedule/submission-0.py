"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        timeset = set()
        for c in intervals:
            for i in range(c.start,c.end):
                if i in timeset:
                    return False
                else:
                    timeset.add(i)
        
        return True