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

function reverseKGroup(head: ListNode | null, k: number): ListNode | null {
    const getLength = (node: ListNode | null): number => {
        let length = 0;
        while (node) {
            length++;
            node = node.next;
        }
        return length;
    };

    let length = getLength(head);
    let newHead: ListNode | null = null;
    let tail: ListNode | null = null;
    let current = head;

    while (length >= k) {
        let first = current;
        let prev: ListNode | null = null;

        for (let i = 0; i < k; i++) {
            let nextNode = current!.next;
            current!.next = prev;
            prev = current;
            current = nextNode;
        }

        if (!newHead) {
            newHead = prev;
        } else {
            tail!.next = prev;
        }

        tail = first!;
        length -= k;
    }

    if (tail) {
        tail.next = current;
    }

    return newHead || head;
}
