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
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && maxVal(root.left) >= root.val)
            return false;
        if (root.right != null && minVal(root.right) <= root.val)
            return false;
        if (!isValidBST(root.left) || !isValidBST(root.right))
            return false;
        return true;
    }

    int maxVal(TreeNode node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.val;
        int lres = maxVal(node.left);
        int rres = maxVal(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    int minVal(TreeNode node) {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.val;
        int lres = minVal(node.left);
        int rres = minVal(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }
}