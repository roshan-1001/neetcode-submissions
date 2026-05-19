class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        n = len(tokens)
        st = []
        i = 0 
        while i<n:
            if tokens[i] == "+":
                p1 = st.pop()
                p2 = st.pop()
                st.append(p1+p2)
            elif tokens[i] == "-":
                p1 = st.pop()
                p2 = st.pop()
                st.append(p2-p1)
            elif tokens[i] == "*":
                p1 = st.pop()
                p2 = st.pop()
                st.append(p1*p2)
            elif tokens[i] == "/":
                p1 = st.pop()
                p2 = st.pop()
                st.append(int(p2/p1))
            else:
                st.append(int(tokens[i]))
                #print(ord(tokens[i])-ord('0'))
            i+=1
        return st[-1]
            