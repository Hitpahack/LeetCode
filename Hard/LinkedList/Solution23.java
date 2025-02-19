
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

class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode list = new ListNode();
        ListNode temp;
        ListNode head = null;
        int flag = 0;
        int c = 0;
        while (c < lists.length && lists[c] == null) {
            c++;
            flag = 1;
        }
        if (c == lists.length && flag == 1) {
            return null;
        }

        for (int i = c; i < lists.length; i++) {
            temp = lists[i];
            while (temp != null) {
                list = new ListNode(temp.val, head);
                temp = temp.next;
                head = list;
            }
        }

        ListNode temp1 = list;
        int count = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            count++;
        }

        //Bubble sort 
        ListNode temp2 = list;
        while (count != 0) {
            while (temp2.next != null) {
                if (temp2.val > temp2.next.val) {
                    int data = temp2.val;
                    temp2.val = temp2.next.val;
                    temp2.next.val = data;
                }
                temp2 = temp2.next;
            }
            temp2 = list;
            count--;
        }
        return list;

    }
}
