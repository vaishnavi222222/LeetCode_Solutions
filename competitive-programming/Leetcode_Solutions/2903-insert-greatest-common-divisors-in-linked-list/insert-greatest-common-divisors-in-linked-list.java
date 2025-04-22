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
    public  int GCD(int a,int b){
        while(a != b){
            if(a > b) a = a - b;
            else b = b - a;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            ListNode mid = new ListNode(GCD(temp.val,temp.next.val));
            mid.next = temp.next;
            temp.next = mid;
            temp = temp.next.next;
        }
        return head;
        
    }
}