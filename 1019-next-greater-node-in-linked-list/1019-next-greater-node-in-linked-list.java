/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            l.add(temp.val);
            temp = temp.next;
        }
        int[] sample = new int[l.size()];
        for(int i=0;i<l.size();i++){
            sample[i] = l.get(i);
        }
        int[] ans = new int[l.size()];
        Arrays.fill(ans,0);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<l.size();i++){
            while(!st.isEmpty() && sample[i] > sample[st.peek()]){
                ans[st.pop()] = sample[i];
            }
            st.push(i);
        }
        return ans;
        
    }
}