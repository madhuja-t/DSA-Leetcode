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
    public int getDecimalValue(ListNode head) {
        if(head == null)return 0;
        String s = "";
        ListNode temp = head;
        while(temp != null){
            s = temp.val+s;
            temp = temp.next;
        }
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans = ans+ (1<<i);
            }
        }
        return ans;
    }
}