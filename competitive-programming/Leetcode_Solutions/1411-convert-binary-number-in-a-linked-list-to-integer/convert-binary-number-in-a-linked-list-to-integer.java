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
    public int getDecimalValue(ListNode head) {
        ListNode h1 = head ;
        int len = 0;
        int sum = 0;
        while(h1 != null){
            len++;
            h1 = h1.next;
        }
        while(head != null){
            sum += (1<<len-1)*head.val;
            head = head.next;
            len--;
        }
        return sum;
    }
}