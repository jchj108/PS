package leetcode.fourteendays.twopointer;

public class MiddleOfTheLinkedList {

    static class ListNode {
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

//    public static ListNode middleNode(ListNode head) {
//
//
//    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next = new ListNode(4);

//        middleNode(listNode);
    }
}
