/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if (head === null) {
        return null;
    }
    let current = head;
    while (head.next !== null) {
        if (head.val === head.next.val) {
            head.next = head.next.next;
        }
        if (head.next !== null && head.val !== head.next.val) {
            head = head.next;
        }
    }
    return current;
};