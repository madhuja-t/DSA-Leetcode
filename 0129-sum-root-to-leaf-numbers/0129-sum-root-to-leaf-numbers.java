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
    public int sumNumbers(TreeNode root) {
        if(root == null)return 0;
        List<TreeNode> leaf = new ArrayList<>();
        collectLeaf(root,leaf);
        int sum=0;
        for(int i=0;i<leaf.size();i++){
             List<Integer> path =  new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            fbh(root,path, leaf.get(i));
            Collections.reverse(path);
            for(int j=0;j<path.size();j++){
                sb.append(path.get(j));
            }
            String ans = sb.toString();
            int val = Integer.parseInt(ans);
            sum+=val;
        }
        return sum;
    }
    public void collectLeaf(TreeNode root, List<TreeNode> leaf){
        if(root==null)return;
        if(root.left == null && root.right == null){
            leaf.add(root);
        }
        collectLeaf(root.left,leaf);
        collectLeaf(root.right,leaf);
    }
    public void fbh(TreeNode root, List<Integer> path,TreeNode des){
        if(root==null)return;
        if(root == des){
            path.add(root.val);
            return;
        }
        fbh(root.left,path,des);
        if(path.size()>0){
            path.add(root.val);
            return;
        }

        fbh(root.right,path, des);
        if(path.size()>0){
            path.add(root.val);
            return;
        }
    }
}