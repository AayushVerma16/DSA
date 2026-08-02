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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        while( l1 != null || l2 != null ) {
            int sum = carry;
            if( l1 != null ) {
                sum = sum + l1.val;
            }
            if( l2 != null) {
                sum = sum + l2.val;
            }
            ListNode x = new ListNode( sum % 10 );
            carry = sum / 10;
            current.next = x;
            current = current.next;
            if( l1 != null ) l1 = l1.next;
            if( l2 != null ) l2 = l2.next;
        }
        if( carry != 0 ) {
            ListNode y = new ListNode( carry );
            current.next = y;
        }
        return dummy.next;
    }
}