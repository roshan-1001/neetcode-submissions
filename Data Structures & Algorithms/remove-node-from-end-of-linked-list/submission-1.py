# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        l = 0
        curr = head
        while(curr):
            l +=1
            curr = curr.next
        print(l)
        p = l-n +1
        if p==1:
            return head.next
        counter = 2
        prev = head
        curr = head.next
        while counter:
            if counter == p:
                prev.next = curr.next
                return head
            else:
                counter+=1
                prev = curr
                curr = curr.next
        return head