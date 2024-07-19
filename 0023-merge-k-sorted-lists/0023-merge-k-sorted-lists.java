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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> li =new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp =lists[i];
            while(temp !=null){
                li.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(li);
        ListNode dummy =new ListNode(-1);
        ListNode temp =dummy;
        for(int num :li){
             ListNode newNode =new ListNode(num);
             temp.next =newNode;
             temp =temp.next;
        }
        return dummy.next;
    }
}