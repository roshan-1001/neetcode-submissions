# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        q = []
        def dfs(root):
            nonlocal q
            if not root:
                return
            q.append(root.val)
            dfs(root.left)
            dfs(root.right)
        dfs(root)
        q = sorted(q)
        print (q)
        return q[k-1]
