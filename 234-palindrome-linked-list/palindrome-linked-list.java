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
    public boolean isPalindrome(ListNode head) {
       List<Integer> arr = new ArrayList<>();
       ListNode current = head;
       while(current != null) {
           arr.add(current.val);
           current = current.next;
       }
       int l = 0;
       int r = arr.size() - 1;
       while(l < r) {
           if(!arr.get(l).equals(arr.get(r))) {
               return false;
           }
           l++;
           r--;
       }
       return true;
    }
}