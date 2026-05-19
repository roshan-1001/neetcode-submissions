# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        count = 0
        currmax = root.val
        def dfs(root, currmax):
            if not root:
                return
            nonlocal count
            if root.val>=currmax:
                count +=1
            if root.left:
                dfs(root.left, max(currmax,root.left.val))
            if root.right:
                dfs(root.right, max(currmax,root.right.val))
        dfs(root,currmax)
        return count

