/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;
        if (l1 == null || l2 == null) {
            return l1 == null? l2: l1;
        }
        while (l2.next != null && l1.next != null) {
            if (l1.val > l2.val) {
                head = l2;
                while (l2.next != null && l1.val > l2.next.val) {
                l2 = l2.next;
                }
                ListNode temp2 = l2.next;
                l2.next = l1;
                l2 = temp2;
            }
            if (l2 == null) {
            return head;
            }
            while (l1.next != null && l1.next.val <= l2.val) {
                l1 = l1.next;
            }
            ListNode temp1 = l1.next;
            ListNode temp2 = l2.next;
            l1.next = l2;
            l1 = l1.next;
            l1.next = temp1;
            l2 = temp2;
        }

        if (l2.next == null) {
            if (l1.val > l2.val && head == l1) {
                head = l2;
                l2.next = l1;
                return head;
            }
            while (l1.next != null && l1.next.val <= l2.val) {
                l1 = l1.next;
            }
            ListNode temp1 = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l1.next = temp1;
            return head;
        }
        if (l1.next == null) {
            if (l1.val > l2.val && head == l1) {
                head = l2;
            }
            while (l2.next != null && l1.val > l2.next.val) {
                l2 = l2.next;
            }
            if (l1.val <= l2.val) {
                l1.next = l2;
            } else {
                ListNode temp2 = l2.next;
                l2.next = l1;
                l1.next = temp2;
            }
            return head;
        }
        return head;
    }
}