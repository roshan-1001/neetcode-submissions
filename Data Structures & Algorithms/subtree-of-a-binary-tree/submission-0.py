# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        issame = False

        def dfs(root,subRoot):
            nonlocal issame
            if not root and not issame:
                return
            if self.sameTree(root,subRoot):
                issame = True
                return
            if root.left: 
                dfs(root.left,subRoot)
            if root.right:
                dfs(root.right,subRoot)
        
        dfs(root,subRoot)
        return issame
            
        
    
    def sameTree(self, root1: Optional[TreeNode],root2: Optional[TreeNode]) -> bool:
        if not root1 and not root2:
            return True
        if not root1 or not root2 or root1.val!=root2.val:
            return False
        return self.sameTree(root1.left,root2.left) and self.sameTree(root1.right,root2.right)