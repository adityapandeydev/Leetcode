/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseKGroup(head *ListNode, k int) *ListNode {
    getLength := func(node *ListNode) int {
        length := 0
        for node != nil {
            length++
            node = node.Next
        }
        return length
    }

    length := getLength(head)
    var newHead, tail *ListNode
    current := head

    for length >= k {
        first := current
        var prev *ListNode

        for i := 0; i < k; i++ {
            nextNode := current.Next
            current.Next = prev
            prev = current
            current = nextNode
        }

        if newHead == nil {
            newHead = prev
        } else {
            tail.Next = prev
        }

        tail = first
        length -= k
    }

    if tail != nil {
        tail.Next = current
    }

    return newHead
}
