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
    ListNode* reverseKGroup(ListNode* head, int k) {
        int length = 0;
        ListNode* temp = head;
        while (temp) {
            length++;
            temp = temp->next;
        }

        ListNode* newHead = nullptr;
        ListNode* tail = nullptr;
        ListNode* current = head;

        while (length >= k) {
            ListNode* first = current;
            ListNode* prev = nullptr;

            for (int i = 0; i < k; i++) {
                ListNode* nextNode = current->next;
                current->next = prev;
                prev = current;
                current = nextNode;
            }

            if (!newHead) {
                newHead = prev;
            } else {
                tail->next = prev;
            }

            tail = first;
            length -= k;
        }

        if (tail) {
            tail->next = current;
        }

        return newHead ? newHead : head;
    }
};
