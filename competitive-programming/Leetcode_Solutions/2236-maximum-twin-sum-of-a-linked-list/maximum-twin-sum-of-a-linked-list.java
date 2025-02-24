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
    public ListNode reverseList(ListNode h) {
        if(h == null || h.next == null) return h;
        ListNode curr = h;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        if(head == null || head.next == null) return 0;
        ListNode h1 = head;
        ListNode fast = head.next;
        ListNode slow = head;
        if(fast.next == null)return slow.val + fast.val;
        while(fast != null&&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next != null){
           fast = reverseList(slow.next);
        }
        int max = 0;
        while(fast != null){
             max = Math.max(max , head.val + fast.val);
             head = head.next;
             fast = fast.next;
        }
       return max; 
    }
}