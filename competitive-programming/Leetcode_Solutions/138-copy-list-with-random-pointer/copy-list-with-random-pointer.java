/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public static Node clonell(Node head){
        if(head == null) return null;
        Node n = new Node (head.val);
        n.next = clonell(head.next);
        return n;
    }

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();
        Node p1 = head;
        Node q1 = p1;
        Node p2 = clonell(head);
        Node q2 = p2;
        Node temp = p2;
        while(p1 != null && p2 != null) {
            hm.put(p1 , p2);
            p1 = p1.next;
            p2 = p2.next;
        }
        while(q1 != null) {
            q2.random = hm.get(q1.random);
            q1 = q1.next;
            q2 = q2.next;
        }
        return temp;
    }
}