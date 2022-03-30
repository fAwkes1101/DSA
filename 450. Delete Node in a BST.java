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
    
    public int max(TreeNode root){
        if(root.right==null){
            return root.val;
        }
        
        return max(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null) return null;
        
        if(root.val==key){
            if(root.right!=null && root.left!=null){
                int data = max(root.left);
                root.val = data;
                root.left = deleteNode(root.left,data);
            }
            else if(root.right==null){
                return root.left;}
            else{
                return root.right;
            }
        }
       root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        
        return root;
        
    }
}
