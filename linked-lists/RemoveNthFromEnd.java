class NthNode {
    int val;
    NthNode next;

    NthNode(int val) {
        this.val = val;
    }
}

public class RemoveNthFromEnd {
    public static NthNode removeNthFromEnd(NthNode head, int n) {
        NthNode dummy = new NthNode(0);
        dummy.next = head;
        NthNode fast = dummy;
        NthNode slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void print(NthNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NthNode head = new NthNode(1);
        head.next = new NthNode(2);
        head.next.next = new NthNode(3);
        head.next.next.next = new NthNode(4);
        head.next.next.next.next = new NthNode(5);

        print(removeNthFromEnd(head, 2)); // remove 4
    }
}
