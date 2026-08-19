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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode temp = head;
        if (temp.next != null) {
            temp = reverseList(temp.next);
            head.next.next = head; // ?
        }
        head.next = null; // last reverse, head become tail
        return temp;
    }
}
