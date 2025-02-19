
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

class Solution21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null && temp2 != null) {
            ListNode node;
            if (temp1.val < temp2.val) {
                node = new ListNode(temp1.val, head);
                temp1 = temp1.next;
            } else if (temp1.val > temp2.val) {
                node = new ListNode(temp2.val, head);
                temp2 = temp2.next;
            } else {
                node = new ListNode(temp1.val, head);
                head = node;
                node = new ListNode(temp2.val, head);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            head = node;
        }

        while (temp1 != null) {
            ListNode node;
            node = new ListNode(temp1.val, head);
            temp1 = temp1.next;
            head = node;
        }

        while (temp2 != null) {
            ListNode node;
            node = new ListNode(temp2.val, head);
            temp2 = temp2.next;
            head = node;
        }

        temp1 = null;
        temp2 = head;
        ListNode temp3 = null;
        while (temp2 != null) {
            temp3 = temp2.next;
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
        }
        head = temp1;
        return head;
    }
}
