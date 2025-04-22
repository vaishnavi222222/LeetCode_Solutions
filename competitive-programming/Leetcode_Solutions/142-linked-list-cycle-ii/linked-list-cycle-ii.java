/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        HashSet<ListNode> hm = new HashSet<>();
        while(head.next != null) {
            if(hm.contains(head)){
                return head;
            }
            else hm.add(head);
            head = head.next;
        }
        return null;
        
    }
}