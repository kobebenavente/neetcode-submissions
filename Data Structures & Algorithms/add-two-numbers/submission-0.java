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
        while(l1 != null & l2 != null){
            int added = l1.val + l2.val + carry;
            if(added > 9){
                carry = added/10;
                sum.next = new ListNode(added % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(added);
            }
            sum = sum.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            int added = l1.val + carry; 
            if(added > 9){
                carry = added/10;
                sum.next = new ListNode(added % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(added);
            }
            sum = sum.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int added = l2.val + carry; 
            if(added > 9){
                carry = added/10;
                sum.next = new ListNode(added % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(added);
            }
            sum = sum.next;
            l2 = l2.next;
        }

        if(carry > 0){
            sum.next = new ListNode(carry);
        }

        return sumHead.next;

    }
    /*
    -given two linked lists that represents a non-negative integer
    -digits are stored in reverse order (EX: 321 IS 1 -> 2 -> 3)
    -each node contains a single digit
    */
}
