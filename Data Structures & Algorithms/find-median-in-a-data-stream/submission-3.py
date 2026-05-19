class MedianFinder:

    def __init__(self):
        self.data = []

    def addNum(self, num: int) -> None:
        self.data.append(num)

    def findMedian(self) -> float:
        n = len(self.data)
        self.data.sort()
        if n%2 == 1:
            print(n//2)
            return self.data[int((n//2))]
        else:
            m = int((n//2))
            if m == 0:
                return float(0);
            return (self.data[m] + self.data[m-1])/2

        