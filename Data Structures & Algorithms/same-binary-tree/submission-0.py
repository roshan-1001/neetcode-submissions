# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        same = True
        def dfs(p,q):
            nonlocal same
            if not p and not q:
                return
            elif q and not p:
                same = False
                return
            elif p and not q:
                same = False
                return
            elif p.val != q.val:
                same = False
                return
            else:
                dfs(p.right,q.right)
                dfs(p.left,q.left)
                return
        dfs(p,q)
        return same