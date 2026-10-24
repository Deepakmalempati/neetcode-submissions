/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {

        
        return nodes(root, root.val);
    }

    public int nodes(TreeNode root, int maxSofar){
        if(root == null) return 0;
        int result=0;
        if(root.val>= maxSofar){
            result++;
        }
        maxSofar= Math.max(maxSofar, root.val);
        result += nodes(root.left, maxSofar);
        result += nodes(root.right, maxSofar);
        return result;
    }
}
