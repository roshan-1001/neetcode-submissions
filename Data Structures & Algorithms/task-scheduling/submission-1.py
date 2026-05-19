class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        m = len(tasks)
        count = Counter(tasks)
        maxHeap = [-cnt for cnt in count.values()]
        heapq.heapify(maxHeap)
        time = 0
        q = deque()
        while(maxHeap or q):
            if not maxHeap:
                time+=1
            if maxHeap:
                curr = heapq.heappop(maxHeap)
                time +=1
                if curr+1<0:
                    q.append([curr+1, time+n])
            while q and q[0][1]<=time:
                top = q.pop()
                maxHeap.append(top[0])
            heapq.heapify(maxHeap)
        return time
