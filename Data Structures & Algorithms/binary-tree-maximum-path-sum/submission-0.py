# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        self.currmax = root.val
        if not root:
            return 0
        def dfs(root):
            #nonlocal currmax
            if not root:
                return 0
            left = dfs(root.left)
            right = dfs(root.right)
            leftmax = max(0,left)
            rightmax = max(0,right)

            self.currmax = max (self.currmax, leftmax+rightmax+root.val)
            return root.val + max(leftmax, rightmax)
        dfs(root)
        return self.currmax