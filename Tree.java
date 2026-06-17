import java.util.*;

class Tree {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        // Input elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Key to delete
        int x = sc.nextInt();

        // Sort -> inorder traversal of BST
        Collections.sort(list);

        // Before deletion
        System.out.print("Before deletion: ");

        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Remove by value
        list.remove(Integer.valueOf(x));

        // After deletion
        System.out.print("After deletion: ");

        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}