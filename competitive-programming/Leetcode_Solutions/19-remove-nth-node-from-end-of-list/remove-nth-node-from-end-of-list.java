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
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int p = len - n + 1;
        if(p == 1) return head.next;
        ListNode prev = null;
        ListNode temp = head;
        for(int i=1;i<p;i++){
            prev= temp;
            temp=temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}