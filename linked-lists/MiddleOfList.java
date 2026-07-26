class MidNode {
    int val;
    MidNode next;

    MidNode(int val) {
        this.val = val;
    }
}

public class MiddleOfList {
    public static MidNode middleNode(MidNode head) {
        MidNode slow = head;
        MidNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MidNode head = new MidNode(1);
        head.next = new MidNode(2);
        head.next.next = new MidNode(3);
        head.next.next.next = new MidNode(4);
        head.next.next.next.next = new MidNode(5);

        MidNode mid = middleNode(head);
        System.out.println("Middle = " + mid.val);
    }
}
