class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetricUtil(root.left, root.right);
    }

    boolean isSymmetricUtil(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left != null && right != null && left.val == right.val
                && isSymmetricUtil(left.left, right.right)
                && isSymmetricUtil(left.right, right.left))
            return true;
        return false;

    }
}