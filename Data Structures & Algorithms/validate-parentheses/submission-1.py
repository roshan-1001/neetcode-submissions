class Solution:
    def isValid(self, s: str) -> bool:
        dq = deque()
        for i in s:
            if i == '(' or i=='{' or i=='[':
                dq.append(i)
            elif i and not dq:
                return False
            elif dq:
                if i == ')' and dq[-1] != '(':
                    return False
                if i == '}' and dq[-1] != '{':
                    return False
                if i == ']' and dq[-1] != '[':
                    return False
                dq.pop()
        if dq:
            return False
        return True