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
        ListNode first = null;
        ListNode currentNode = null;
        int carry = 0;
        
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode value = new ListNode(digit);
            if (first == null) {
                first = value;
            }
            if (currentNode == null) {
                currentNode = value;
            } else {
                currentNode.next = value;
                currentNode = value;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        ListNode remaining = (l1 == null) ? l2 : l1;
        while (remaining != null) {
            int sum = remaining.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode value = new ListNode(digit);
            currentNode.next = value;
            currentNode = value;
            remaining = remaining.next;
        }
        
        if (carry != 0) {
            ListNode value = new ListNode(carry);
            currentNode.next = value;
            currentNode = value;
        }
        
        return first;
    }
}
