/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var reverseKGroup = function(head, k) {
    const getLength = (node) => {
        let length = 0;
        while (node) {
            length++;
            node = node.next;
        }
        return length;
    };

    let length = getLength(head);
    let newHead = null, tail = null;
    let current = head;

    while (length >= k) {
        let first = current, prev = null;

        for (let i = 0; i < k; i++) {
            let nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        if (!newHead) {
            newHead = prev;
        } else {
            tail.next = prev;
        }

        tail = first;
        length -= k;
    }

    if (tail) {
        tail.next = current;
    }

    return newHead || head;
};
