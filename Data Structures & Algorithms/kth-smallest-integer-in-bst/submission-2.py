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
  
            if not root:
                return
            
            dfs(root.left)
            q.append(root.val)
            dfs(root.right)
        dfs(root)
      
        print (q)
        return q[k-1]
