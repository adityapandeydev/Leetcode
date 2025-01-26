/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (!head) return NULL;
    struct ListNode* current = head;
    while (head->next) {
        if (head->val == head->next->val) {
            head->next = head->next->next;
        }
        if (head->next && head->val != head->next->val) {
            head = head->next;
        }
    }
    return current;
}