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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sum = new ListNode(0);
        ListNode sumHead = sum;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){
            int l1num = (l1 != null) ? l1.val : 0;
            int l2num = (l2 != null) ? l2.val : 0;
            int added = l1num + l2num + carry;
            carry = added/10;
            sum.next = new ListNode(added % 10);
            sum = sum.next;
            if(l1 != null){
               l1 = l1.next; 
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return sumHead.next;
    }
    /*
    -given two linked lists that represents a non-negative integer
    -digits are stored in reverse order (EX: 321 IS 1 -> 2 -> 3)
    -each node contains a single digit
    */
}
