/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int rem=0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int sum = 0;
        while (t1 != null && t2 != null) {
            sum =sum + (t1.val + t2.val);
            if (sum <= 9) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            else{
                rem=sum%10;
                carry =sum/10;
                current.next = new ListNode(rem);
                current = current.next;
                sum = carry;
            }
            t1=t1.next;
            t2=t2.next;
        }
        while(t1 != null){
            sum =sum+t1.val;
            if (sum <= 9) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            else{
                rem=sum%10;
                carry =sum/10;
                current.next = new ListNode(rem);
                current = current.next;
                sum = carry;
            }
            t1=t1.next;
        }
         while(t2 != null){
            sum =sum+t2.val;
            if (sum <= 9) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            else{
                rem=sum%10;
                carry =sum/10;
                current.next = new ListNode(rem);
                current = current.next;
                sum = carry;
            }
            t2=t2.next;
        }
        if(sum>0){
            current.next = new ListNode(sum);
                current = current.next;
        }
        return dummy.next;
    }
}