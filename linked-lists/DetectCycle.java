class CycleNode {
    int val;
    CycleNode next;

    CycleNode(int val) {
        this.val = val;
    }
}

public class DetectCycle {
    public static boolean hasCycle(CycleNode head) {
        CycleNode slow = head;
        CycleNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleNode a = new CycleNode(1);
        CycleNode b = new CycleNode(2);
        CycleNode c = new CycleNode(3);
        CycleNode d = new CycleNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle back to 2

        System.out.println(hasCycle(a) ? "Cycle detected" : "No cycle");

        d.next = null;
        System.out.println(hasCycle(a) ? "Cycle detected" : "No cycle");
    }
}
