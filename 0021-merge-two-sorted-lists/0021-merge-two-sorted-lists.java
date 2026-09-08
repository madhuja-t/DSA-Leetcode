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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->
         a.val-b.val
        );
        if(list1 != null){
            pq.add(list1);
        }
        if(list2 != null){
            pq.add(list2);
        }
        ListNode dummy = new ListNode(-99);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode curr = pq.remove();
            tail.next = curr;
            tail = tail.next;
            if(curr.next !=null){
                pq.add(curr.next);
            }
        }
        return dummy.next;
    }
}