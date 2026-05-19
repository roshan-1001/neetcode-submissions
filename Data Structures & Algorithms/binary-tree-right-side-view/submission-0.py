# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        q = deque()
        if not root:
            return res
        q.append(root)
        while(q):
            n = len(q)
            
            while(n):
                p = q.popleft()
                if n == 1:
                    level = p.val
                if p.left:
                    q.append(p.left)
                if p.right:
                    q.append(p.right)
                n-=1;
            res.append(level)
        return res
            