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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
        }
        current = head;
        ListNode newHead = null;
        ListNode tail = null;
        while(length >= k) {
            ListNode first = current;
            ListNode prev = null;
            for (int i = 0; i < k; i++) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            }
            if (newHead == null) {
                newHead = prev;
            } else {
                tail.next = prev;
            }
            length -= k;
            tail = first;
        }
        tail.next = current;
        return newHead;
    }
}