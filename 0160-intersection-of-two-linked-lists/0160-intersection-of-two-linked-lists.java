/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        ListNode temp = headA;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = headB;
        ListNode s = headA;
        ListNode f = headA;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                ListNode start = headA;
                while(start != s){
                    s = s.next;
                    start = start.next;
                }
                temp.next = null;
                return start;
            }
        }
        temp.next = null;
        return null;
    }
}