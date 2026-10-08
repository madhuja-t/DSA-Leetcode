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
    ArrayList<TreeNode> leaf ;
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null)return ans;
        leaf = new ArrayList<>();
        collectLeaf(root,leaf);
        for(int i=0;i<leaf.size();i++){
            ArrayList<Integer> l = new ArrayList<>();
            StringBuilder s = new StringBuilder();
             fbh(root,l,leaf.get(i));
             for(int j= l.size()-1;j>=0;j--){
               s.append(l.get(j));
               if(j!=0){
                s.append("->");
               }
             }
             ans.add(s.toString());
        }
        return ans;
    }
    public void collectLeaf(TreeNode root, ArrayList<TreeNode> leaf){
        if(root==null)return;
        if(root.left == null && root.right ==null){
            leaf.add(root);
        }
        collectLeaf(root.left,leaf);
        collectLeaf(root.right,leaf);
    }
    public void fbh(TreeNode root, ArrayList<Integer> l , TreeNode des){
        if(root == null)return;
        if(root == des){
            l.add(root.val);
            return;
        }
        fbh(root.left, l, des);
        if(l.size()>0){
            l.add(root.val);
            return;
        }
        fbh(root.right,l,des);
        if(l.size()>0){
            l.add(root.val);
            return;
        }

    }
}