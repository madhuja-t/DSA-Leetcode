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
        ArrayList<TreeNode> lsr;
        ArrayList<TreeNode> ldr;
    public String getDirections(TreeNode root, int startValue, int destValue) {
        String ans = "";
        if(root == null)return ans;
        StringBuilder s = new StringBuilder();
        lsr = new ArrayList<>();
        ldr = new ArrayList<>();
        fbh(root,lsr,startValue);
        fbh(root,ldr,destValue);
        int i=lsr.size()-1;
        int j = ldr.size()-1;
        while(i>=0 && j>=0 && lsr.get(i) == ldr.get(j)){
            i--;
            j--;
        }
        for(int k = 1;k<=i+1;k++){
            s.append("U");
        }
        while(j>=0){
            if(ldr.get(j+1).left == ldr.get(j)){
                s.append("L");
            }else{
                s.append("R");
            }
            j--;
        }
        ans = s.toString();
        return ans;
        
    }
    public void fbh(TreeNode root, ArrayList<TreeNode> l,int dest){
        if(root == null)return;
        if(root.val == dest){
            l.add(root);
            return;
        }
        fbh(root.left,l,dest);
        if(l.size()>0){
            l.add(root);
            return;
        }

        fbh(root.right,l,dest);
        if(l.size()>0){
            l.add(root);
            return;
        }
    }
}