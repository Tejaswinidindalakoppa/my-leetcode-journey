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
class BSTIterator {

    Queue<Integer> q;
    public void inOrder(TreeNode root){
        if(root== null){
            return;
        }

        if(root.left!=null){
            inOrder(root.left);
        }
        q.add(root.val);
        if(root.right!=null){
            inOrder(root.right);
        }
    }
    public BSTIterator(TreeNode root) {
        q = new LinkedList<>();
        inOrder(root);
    }
    
    public int next() {
        return q.poll();
    }
    
    public boolean hasNext() {
        if(q.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */