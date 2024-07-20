 public Node RemoveHalfNodes(Node root) {
        // Code Here
        if(root==null)return null;
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        if(root.left==null && root.right!=null)return root.right;
        if(root.left!=null && root.right==null)return root.left;
        return root;
    }
