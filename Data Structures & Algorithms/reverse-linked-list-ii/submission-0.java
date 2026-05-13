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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftdummy = new ListNode(0,head);
        ListNode leftprev = leftdummy, curr = head;
        for(int i=0; i<left-1; i++){
            leftprev = curr;
            curr = curr.next;
        }

        ListNode prev = null;
        for (int i=0; i<right-left+1;i++){
            ListNode tempnxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempnxt;

        }

        leftprev.next.next=curr;
        leftprev.next = prev;

        return leftdummy.next;
    }
}