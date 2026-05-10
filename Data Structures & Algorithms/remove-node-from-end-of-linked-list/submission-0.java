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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode front = head;
        ListNode back = dummy;

        while(front != null){
            front = front.next;
            n--;
            if(n < 0){
                back = back.next;
            }
        }
        back.next = back.next.next;
        return dummy.next;
    }
}
