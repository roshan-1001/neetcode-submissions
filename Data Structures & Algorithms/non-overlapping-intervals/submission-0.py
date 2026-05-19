class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x:x[0])
        currend = intervals[0][1]
        count = 0
        n = len(intervals)
        for i in range(1,n):
            if intervals[i][0]<currend:
                count+=1
                currend = min(currend,intervals[i][1])
            else:
                currend = intervals[i][1]
            
        return count