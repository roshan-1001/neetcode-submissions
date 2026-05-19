# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        slow = head
        fast = head
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next
            fast = fast.next
            
        
        midpoint = slow
        
        
        prev = None
        current = midpoint
        while(current):
            newnode = current.next
            current.next = prev
            prev = current
            current = newnode
        head1 = head
        head2 = prev
        while( head2):
            temp1 = head1.next
            temp2 = head2.next
            head1.next = head2
            head2.next = temp1
            head1 = temp1
            head2 = temp2
        if head1:
            head1.next = None
        return

        