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
        if (head == null) return null;
        ListNode temp = head;
        if (temp.next != null) {
            temp = reverseList(temp.next);
            head.next.next = head;
        }
        head.next = null;
        return temp;
    }
}
