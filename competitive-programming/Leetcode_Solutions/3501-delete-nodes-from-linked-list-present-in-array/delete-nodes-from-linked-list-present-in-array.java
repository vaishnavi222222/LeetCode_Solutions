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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode dummy =  new ListNode(-1);
        ListNode prev  = dummy;
        ListNode temp = dummy;
        temp.next = head;
        temp = temp.next;
        while(temp != null){
            int val = temp.val;
            int cnt = 0;
            if(set.contains(val)) cnt = 1;
            if(cnt == 1){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return dummy.next;

        
    }
}