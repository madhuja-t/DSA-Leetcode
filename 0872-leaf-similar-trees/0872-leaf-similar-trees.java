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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)return true;
        if(root1 == null || root2 == null)return false;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        collect(root1,l1);
        collect(root2,l2);
      
        return l1.equals(l2);
    }

    void collect(TreeNode root, List<Integer> l){
        if(root == null)return;
        if(root.left == null && root.right == null){
            l.add(root.val);
        }else{
             collect(root.left,l);
            collect(root.right,l);
        }
    }

}