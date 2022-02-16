// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 1;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            len++;
        }
        
        int mid = (len + 1) / 2;
        curr = head;
        while(mid != 1) {
            curr = curr.next;
            mid--;
        }
        return curr;
    }
}