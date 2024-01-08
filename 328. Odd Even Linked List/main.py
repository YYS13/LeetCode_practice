class Solution(object):
    def oddEvenList(self, head):
        if head == None or head.next == None:
            return head
        odd = head
        even = head.next
        connect_point = even
        while even.next != None:
            odd.next = even.next
            odd = odd.next
            even.next = odd.next
            even = even.next
            if even == None:
                break
        odd.next = connect_point
        return head
