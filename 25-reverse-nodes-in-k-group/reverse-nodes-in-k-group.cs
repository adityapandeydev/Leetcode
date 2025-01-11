/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode newHead = null;
        ListNode tail = null;
        ListNode current = head;

        while (length >= k) {
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

            tail = first;
            length -= k;
        }

        if (tail != null) {
            tail.next = current;
        }

        return newHead ?? head;
    }
}
