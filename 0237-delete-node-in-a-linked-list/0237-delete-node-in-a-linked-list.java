/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int nextVal = node.next.val;
        ListNode nextNextNode = node.next.next;
        node.val = nextVal;
        node.next = nextNextNode;
    }
}