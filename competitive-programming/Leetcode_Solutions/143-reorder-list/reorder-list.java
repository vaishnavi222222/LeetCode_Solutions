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
    public ListNode middle(ListNode head, boolean lower) {
        if(head == null ||head.next == null) return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while( fast!=null && fast.next!=null ){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast == null && lower) return prev;
        return slow;
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid=middle(head,true);
        ListNode pre=mid.next;
        mid.next = null;
        ListNode l2=reverse(pre);
        ListNode p1=head;
        ListNode p2=l2;
        int cnt = 1;
        while( p1 != null && p2 != null){
            if(cnt%2 != 0){
                ListNode tmp = p1.next;
                p1.next = p2;
                // System.out.print(p1.val+" ");
                p1 = tmp;
            }
            else{
                ListNode tmp = p2.next;
                p2.next = p1;
                // System.out.print(p2.val+" ");
                p2 = tmp;
            }
           
            cnt++;
        }
    }
}