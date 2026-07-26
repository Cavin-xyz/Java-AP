class InvertNode {
    int val;
    InvertNode left, right;

    InvertNode(int val) {
        this.val = val;
    }
}

public class InvertTree {
    public static InvertNode invert(InvertNode root) {
        if (root == null) {
            return null;
        }
        InvertNode temp = root.left;
        root.left = invert(root.right);
        root.right = invert(temp);
        return root;
    }

    public static void inorder(InvertNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        InvertNode root = new InvertNode(4);
        root.left = new InvertNode(2);
        root.right = new InvertNode(7);
        root.left.left = new InvertNode(1);
        root.left.right = new InvertNode(3);
        root.right.left = new InvertNode(6);
        root.right.right = new InvertNode(9);

        System.out.print("Before: ");
        inorder(root);
        System.out.println();

        invert(root);

        System.out.print("After:  ");
        inorder(root);
        System.out.println();
    }
}
