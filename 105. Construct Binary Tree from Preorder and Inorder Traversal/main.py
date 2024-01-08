class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        if len(preorder) == 0:
            return None
        root = TreeNode()
        root.val = preorder[0]
        left_inorder = []
        right_inorder = []
        for i in range(len(inorder)):
            if inorder[i] == root.val:
                if i != 0:
                    left_inorder = inorder[:i]
                if i != len(inorder)-1:
                    right_inorder = inorder[i+1:]
        left_preorder = preorder[1:1+len(left_inorder)]
        right_preorder = preorder[1+len(left_inorder):]
        root.left = self.buildTree(left_preorder, left_inorder)
        root.right = self.buildTree(right_preorder, right_inorder)
        return root