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
    public int kthSmallest(TreeNode root, int k) {
       return morris(root, k);
    }

    public TreeNode getLeftRightMost(TreeNode node, TreeNode parent){
        while(node.right != null && node.right != parent){
            node = node.right;
        }
        return node;
    }
    public int morris(TreeNode root, int k){
        TreeNode curr = root;
        int res = -1;
        while(curr != null){
            TreeNode left = curr.left;
            if(left == null){
                k--;
                if(k == 0){
                    res = curr.val;
                    break;
                }
                curr = curr.right;
            }else{
                TreeNode leftRightMost = getLeftRightMost(curr.left, curr);
                if(leftRightMost.right == null){
                    leftRightMost.right = curr;
                    curr = curr.left;
                } else{
                    leftRightMost.right = null;
                     k--;
                   if(k == 0){
                    res = curr.val;
                    break;
                  }
                    curr = curr.right;
                }

            }
        }
        return res;
    }
}