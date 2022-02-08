import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Definition for a binary tree node.
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();
        
        List<List<Integer>> levelOrderList = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> levelOrdQueue = new LinkedList<TreeNode>();
        
        levelOrderList.add(new ArrayList<Integer>());
        int level = 0;
        levelOrderList.get(level).add(root.val);
        
        levelOrdQueue.add(root);
            
        while(!levelOrdQueue.isEmpty()) {
            levelOrderList.add(new ArrayList<Integer>());
            level++;
            int n = levelOrdQueue.size();
            
            for(int i = 0; i < n; i++) {
                TreeNode t = levelOrdQueue.poll();
                levelOrderList.get(level).add(t.val);
                if(t.left != null) levelOrdQueue.add(t.left);
                if(t.right != null) levelOrdQueue.add(t.right);
            }
        }
        levelOrderList.remove(0);
        return levelOrderList;
    }
}