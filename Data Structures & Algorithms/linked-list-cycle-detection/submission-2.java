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
    public boolean hasCycle(ListNode head) {
        ListNode head2 = head;
        while(head2 != null){

            head = head.next;
            head2 = head2.next;
            if(head2 == null){
                return false;
            }
            head2 = head2.next;
            if(head2 == null){
                return false;
            }            

            if(head2 == head){
                return true;
            }

        }

        return false;
    }
}
