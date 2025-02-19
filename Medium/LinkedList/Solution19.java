
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

class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int k = count - n;
        if (n == count) {
            head = head.next;
            return head;
        }
        count = 1;
        temp = head;
        while (count != k) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return head;

    }
}
