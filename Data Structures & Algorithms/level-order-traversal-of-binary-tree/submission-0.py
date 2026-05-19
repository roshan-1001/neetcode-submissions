# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        q = deque()
        if not root:
            return res
        q.append(root)
        while(q):
            n = len(q)
            curr = []
            while(n):
                p = q.popleft()
                if p:
                    curr.append(p.val)
                if p:
                    q.append(p.left)
                if p:
                    q.append(p.right)
                n -=1
            res.append(curr)
        res.pop()
        return res


