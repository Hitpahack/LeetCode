
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

class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode head = null;
        int carry = 0;
        int sum = 0;
        while (temp1 != null && temp2 != null) {
            sum = temp1.val + temp2.val;
            ListNode node;
            if ((carry + sum) / 10 == 0) {
                node = new ListNode(carry + sum, head);
                carry = 0;
            } else {
                node = new ListNode((carry + sum) % 10, head);
                carry = 1;
            }
            head = node;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            ListNode node = head;
            if ((carry + temp1.val) / 10 == 0) {
                node = new ListNode(carry + temp1.val, head);
                carry = 0;
            } else {
                node = new ListNode((carry + temp1.val) % 10, head);
                carry = 1;
            }
            head = node;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ListNode node = head;
            if ((carry + temp2.val) / 10 == 0) {
                node = new ListNode(carry + temp2.val, head);
                carry = 0;
            } else {
                node = new ListNode((carry + temp2.val) % 10, head);
                carry = 1;
            }
            head = node;
            temp2 = temp2.next;
        }
        if (carry == 1) {
            ListNode node = new ListNode(carry, head);
            head = node;
        }

        temp1 = null;
        temp2 = head;
        ListNode temp3 = null;

        while (temp2 != null) {
            temp1 = temp2.next;
            temp2.next = temp3;
            temp3 = temp2;
            temp2 = temp1;
        }
        head = temp3;

        return head;
    }
}
