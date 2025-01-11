// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }
impl Solution {
    pub fn reverse_k_group(
        mut head: Option<Box<ListNode>>,
        k: i32,
    ) -> Option<Box<ListNode>> {
        fn get_length(mut node: &Option<Box<ListNode>>) -> i32 {
            let mut length = 0;
            while let Some(n) = node {
                length += 1;
                node = &n.next;
            }
            length
        }

        fn reverse_segment(
            mut head: Option<Box<ListNode>>,
            k: i32,
        ) -> (Option<Box<ListNode>>, Option<Box<ListNode>>) {
            let mut prev = None;
            let mut current = head;
            for _ in 0..k {
                if let Some(mut node) = current {
                    current = node.next.take();
                    node.next = prev;
                    prev = Some(node);
                }
            }
            (prev, current)
        }

        let mut dummy = Some(Box::new(ListNode { val: 0, next: head }));
        let mut group_prev = &mut dummy;
        let mut length = get_length(&group_prev.as_ref().unwrap().next);

        while length >= k {
            let group_start = group_prev.as_mut().unwrap().next.take();

            let (reversed_group, next_segment) = reverse_segment(group_start, k);

            group_prev.as_mut().unwrap().next = reversed_group;

            for _ in 0..k {
                group_prev = &mut group_prev.as_mut().unwrap().next;
            }

            group_prev.as_mut().unwrap().next = next_segment;

            length -= k;
        }

        dummy.unwrap().next
    }
}