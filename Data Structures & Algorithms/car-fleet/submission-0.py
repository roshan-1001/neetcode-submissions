class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        st = []
        n = len(speed)
        fleet = n
        for i in range(n):
            st.append((position[i],speed[i]))
        st.sort(key=lambda x:x[0])
        print(st)
        while len(st)>=2:
            t1 = (target-st[-1][0])/st[-1][1]
            t2 = (target-st[-2][0])/st[-2][1]
            if t2<=t1:
                fleet-=1
                tp = st.pop()
                st.pop()
                st.append(tp)
            else:
                st.pop()
        print(st)
        return fleet

        