class BalanceNode {
    int val;
    BalanceNode left, right;

    BalanceNode(int val) {
        this.val = val;
    }
}

public class BalancedTree {
    public static boolean isBalanced(BalanceNode root) {
        return check(root) != -1;
    }

    // returns height, or -1 if unbalanced
    private static int check(BalanceNode root) {
        if (root == null) {
            return 0;
        }
        int left = check(root.left);
        if (left == -1) {
            return -1;
        }
        int right = check(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        BalanceNode root = new BalanceNode(1);
        root.left = new BalanceNode(2);
        root.right = new BalanceNode(3);
        root.left.left = new BalanceNode(4);
        root.left.right = new BalanceNode(5);

        System.out.println(isBalanced(root) ? "Balanced" : "Not Balanced");

        root.left.left.left = new BalanceNode(6);
        System.out.println(isBalanced(root) ? "Balanced" : "Not Balanced");
    }
}
