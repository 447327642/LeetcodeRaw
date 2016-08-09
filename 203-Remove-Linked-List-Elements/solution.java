/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        while (current.next != null && current.val == val) {
            current = current.next;
        }
        head = current;
        if (current.next == null && current.val == val) {
            return null;
        }
        while (current.next != null) {
        while (current.next != null && current.next.val == val) {
            current.next = current.next.next;
        }
        if (current.next == null) {
            return head;
        } else {
            current = current.next;
        }
        }
        return head;
    }
}


