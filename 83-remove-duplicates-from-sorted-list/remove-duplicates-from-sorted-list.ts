/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function deleteDuplicates(head: ListNode | null): ListNode | null {
    if (head === null) {
        return null;
    }
    let current: ListNode | null = head;
    while (head.next !== null) {
        if (head.val === head.next.val) {
            head.next = head.next.next;
        }
        if (head.next !== null && head.val !== head.next.val) {
            head = head.next;
        }
    }
    return current;
}