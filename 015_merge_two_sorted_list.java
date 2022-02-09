
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tracker = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tracker.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                tracker.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tracker = tracker.next;
        }

        while (list1 != null) {
            tracker.next = new ListNode(list1.val);
            list1 = list1.next;
            tracker = tracker.next;
        }

        while (list2 != null) {
            tracker.next = new ListNode(list2.val);
            list2 = list2.next;
            tracker = tracker.next;
        }
        return head.next;
    }
}