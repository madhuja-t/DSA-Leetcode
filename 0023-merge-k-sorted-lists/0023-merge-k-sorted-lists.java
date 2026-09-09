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
    class Pair{
        ListNode node;
        int row;
        int col;
        Pair(ListNode node,int row,int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
           return a.node.val-b.node.val; 
        });
        int row=0;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
            pq.add(new Pair(lists[i],row,0));
            row++;
            }
        }
        ListNode dummy = new ListNode(-99);
        ListNode temp = dummy; 
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            ListNode currNode = curr.node;
            
            int r = curr.row;
            int c = curr.col;
            temp.next =  currNode;
            temp = temp.next;
            if(currNode.next != null){
                pq.add(new Pair(currNode.next,r,c+1));
            }
        }
        return dummy.next;
    }
}