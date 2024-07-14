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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr = list1;
        ListNode ptr1 = list2;
        ListNode ptr2 = list1;
        while(ptr1.next != null) {
            ptr1 = ptr1.next;
        }
        for(int i = 0; i <= b; i++) {
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr2;
        for(int i = 0; i < a - 1; i++) {
            ptr = ptr.next;
        }
        ptr.next = list2;
        return list1;
    }
}