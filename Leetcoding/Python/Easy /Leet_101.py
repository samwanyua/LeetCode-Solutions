# Definition for a binary tree node.
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def dfs(left, right):
            if not left and not right: # both nodes are null
                return True
            if not left or not right: # if one of the node is not null
                return False
            
            # compare nodes
            return (left.val == right.val and
                dfs(left.left, right.right) and
                dfs(left.right, right.left))
        return dfs(root.left, root.right)