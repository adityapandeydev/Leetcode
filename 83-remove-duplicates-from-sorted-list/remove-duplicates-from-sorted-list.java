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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current=head;
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }
            if(head.next!=null && head.val!=head.next.val){
                head=head.next;
            }
        }
        return current;
    }
}