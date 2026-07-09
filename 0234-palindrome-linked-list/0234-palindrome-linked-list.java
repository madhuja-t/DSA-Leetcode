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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            st.push(curr);
            curr = curr.next;
        }
        int size = st.size();
        ListNode curr1 = head;
        int c=0;
        while(curr1 != null && !st.isEmpty()){
            ListNode node = st.pop();
            if(curr1.val == node.val){
                c++;
            }
            curr1 = curr1.next;
        }
        return c == size;
    }
}