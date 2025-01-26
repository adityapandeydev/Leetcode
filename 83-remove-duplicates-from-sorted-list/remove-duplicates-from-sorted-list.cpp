/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if (head == nullptr) {
            return nullptr;
        }
        ListNode* current = head;
        while (head->next != nullptr) {
            if (head->val == head->next->val) {
                head->next = head->next->next;
            }
            if (head->next != nullptr && head->val != head->next->val) {
                head = head->next;
            }
        }
        return current;
    }
};