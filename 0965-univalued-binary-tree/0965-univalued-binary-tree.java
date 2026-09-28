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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)return true;;
        int val = root.val;
        ArrayList<Integer> l = new ArrayList<>();
        inorder(root,l);
    
        for(int i=0;i<l.size();i++){
            if(!(l.get(i).equals(val)))return false;
        }
        return true;
    }
    public void inorder(TreeNode root, ArrayList<Integer> l){
        if(root == null)return ;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    
}