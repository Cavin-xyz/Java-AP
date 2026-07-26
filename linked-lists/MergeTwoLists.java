class MergeNode {
    int val;
    MergeNode next;

    MergeNode(int val) {
        this.val = val;
    }
}

public class MergeTwoLists {
    public static MergeNode mergeTwoLists(MergeNode l1, MergeNode l2) {
        MergeNode dummy = new MergeNode(0);
        MergeNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void print(MergeNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeNode a = new MergeNode(1);
        a.next = new MergeNode(3);
        a.next.next = new MergeNode(5);

        MergeNode b = new MergeNode(2);
        b.next = new MergeNode(4);
        b.next.next = new MergeNode(6);

        print(mergeTwoLists(a, b));
    }
}
