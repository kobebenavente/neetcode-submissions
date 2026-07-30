/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

    -Store current node, do list.next, then point that next node the one you stored 
    -Initial stored node will be null, since head node after reversing should point to nothing 
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode tail = null;
        ListNode storedNode = new ListNode();
        while(head != null){
            storedNode = head.next;
            head.next = tail;
            tail = head;
            head = storedNode;
        }

        return tail;
    }
}
