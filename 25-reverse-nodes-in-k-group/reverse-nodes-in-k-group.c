/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    struct ListNode* current = head;
    struct ListNode* prev = NULL;
    struct ListNode* next = NULL;
    struct ListNode* tail = NULL;
    struct ListNode* newHead = NULL;
    struct ListNode* temp = head;

    int length = 0;
    while (temp != NULL) {
        length++;
        temp = temp->next;
    }

    while (length >= k) {
        struct ListNode* first = current;
        prev = NULL;

        for (int i = 0; i < k; i++) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }

        if (newHead == NULL) {
            newHead = prev;
        } else {
            tail->next = prev;
        }

        tail = first;
        length -= k;
    }

    if (tail != NULL) {
        tail->next = current;
    }

    return newHead ? newHead : head;
}
