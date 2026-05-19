class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        n = len(prerequisites)
        doihav = [0]*numCourses
        for i in range(n):
            if prerequisites[i][0]==prerequisites[i][1]:
                return False
            doihav[prerequisites[i][0]] = 1
        if sum(doihav)==numCourses:
            return False
        for i in prerequisites:
            i.sort()
        prerequisites.sort()
        for i in range(n-1):
            if prerequisites[i]==prerequisites[i+1]:
                return False
        return True