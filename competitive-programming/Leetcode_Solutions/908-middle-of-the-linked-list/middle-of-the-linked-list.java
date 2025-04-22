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
    public ListNode middleNode(ListNode head) {
        if(head == null ||head.next == null) return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while( fast!=null && fast.next!=null ){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast == null) return prev.next;
        return slow;
    }
}