class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
        int preval = curr.val;
        
        while(curr.next != null) {
            if(curr.next.val == preval) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                preval = curr.val;
            }
        }
        return head;
    }
}