/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre;
        ListNode suc;
        pre = head;
        head = head.next;
        pre.next = null;
        while (head.next != null) {
            suc = head.next;
            head.next = pre;
            pre = head;
            head = suc;
        }
        head.next = pre;
        return head;
    }
}