class Solution:
    def calPoints(self, operations: List[str]) -> int:
        arr = list()
        n = len(operations)
        for op in operations:
            if op == '+':
                t1 = arr[-1]
                t2 = arr[-2]
                arr.append(t1+t2)
            elif op == "C":
                arr.pop()
            elif op == "D":
                arr.append(2*arr[-1])
            else:
                arr.append(int(op))
        return sum(arr)