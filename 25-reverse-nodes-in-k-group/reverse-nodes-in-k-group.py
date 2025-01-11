# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        def get_length(node):
            length = 0
            while node:
                length += 1
                node = node.next
            return length

        length = get_length(head)
        new_head, tail = None, None
        current = head

        while length >= k:
            first = current
            prev = None

            for _ in range(k):
                next_node = current.next
                current.next = prev
                prev = current
                current = next_node

            if not new_head:
                new_head = prev
            else:
                tail.next = prev

            tail = first
            length -= k

        if tail:
            tail.next = current

        return new_head or head
