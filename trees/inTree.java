import java.util.ArrayList;

//Node Structure
class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class inTree {
    static int lc = 0;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int sum = 0;
    static int countPrimes = 0;

    static void inOrder(Node node, ArrayList<Integer> res) {
        if (node == null)
            return;
        if (node.left == null &&
                node.right == null)
            lc++;
        // Traverse the left subtree first
        inOrder(node.left, res);

        // Visit the current node
        res.add(node.data);
        sum += node.data;
        if (node.data < min)
            min = node.data;
        if (node.data > max)
            max = node.data;
        if (isPrime(node.data))
            countPrimes++;
        // Traverse the right subtree last
        inOrder(node.right, res);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create binary tree
        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        ArrayList<Integer> res = new ArrayList<>();
        inOrder(root, res);

        for (int node : res)
            System.out.print(node + " ");
        System.out.println();

        System.out.println("#LeafNodes = " + lc);
        System.out.println("#Min = " + min);
        System.out.println("#Max = " + max);
        System.out.println("#Sum = " + sum);
        System.out.println("#Primes = " + countPrimes);

    }
}