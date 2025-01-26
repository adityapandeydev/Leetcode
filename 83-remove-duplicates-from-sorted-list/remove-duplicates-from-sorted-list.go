/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
    if head == nil {
        return nil
    }
    current := head
    for head.Next != nil {
        if head.Val == head.Next.Val {
            head.Next = head.Next.Next
        }
        if head.Next != nil && head.Val != head.Next.Val {
            head = head.Next
        }
    }
    return current
}