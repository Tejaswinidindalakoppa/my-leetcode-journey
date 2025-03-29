/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        TreeNode left, right;
        left = lowestCommonAncestor(root.left,p,q);
        right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null || (root == p || root == q))
            return root;
        if(left != null || right != null)
            return (left == null)? right : left;
        return null;
    }
}