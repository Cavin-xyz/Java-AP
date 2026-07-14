import java.util.*;

// 1. The blueprint for a single node in the linked list
class ListNode {
    int val;
    ListNode next;

    // Constructor to easily create a node with a value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class reverseLL {

    // 2. Your exact function, placed inside the main class
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // 3. Helper method to print the list to the console
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 4. The main driver method to run the whole thing
    public static void main(String[] args) {
        // Manually creating nodes: 1, 2, and 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

        }

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head); // Prints: 1 -> 2 -> 3 -> null

        // Calling your function and catching the new reversed head
        ListNode reversedHead = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedHead); // Prints: 3 -> 2 -> 1 -> null
    }
}

// public ListNode reverseList(ListNode head){
// ListNode prev = null;
// ListNode curr = head;
// while (curr!=null){
// ListNode next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }
// return prev;
// }
