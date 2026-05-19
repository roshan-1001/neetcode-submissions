# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        isbal = True

        if not root:
            return True
        
        def dfs(root):
            if not root:
                return 0
            nonlocal isbal
            lefth = 1+ dfs(root.left)
            righth = 1+ dfs(root.right)
            if lefth - righth > 1:
                isbal = False
            if righth - lefth > 1:
                isbal = False
            return max(lefth,righth)
        
        dfs(root)
        return isbal