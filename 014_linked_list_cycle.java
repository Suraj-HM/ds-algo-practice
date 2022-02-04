import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution1 {
    public boolean hasCycle(ListNode head) {
        ListNode nextNode = head;
        ListNode nextNextNode = head;

        while (nextNextNode != null && nextNextNode.next != null) {
            nextNextNode = nextNextNode.next.next;
            nextNode = nextNode.next;
            if (nextNode == nextNextNode)
                return true;
        }
        return false;
    }
}


class Solution2 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head != null) {
            if(!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}





