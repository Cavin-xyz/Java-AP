class HeightNode {
    int val;
    HeightNode left, right;

    HeightNode(int val) {
        this.val = val;
    }
}

public class TreeHeight {
    public static int height(HeightNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        HeightNode root = new HeightNode(1);
        root.left = new HeightNode(2);
        root.right = new HeightNode(3);
        root.left.left = new HeightNode(4);
        root.left.right = new HeightNode(5);

        System.out.println("Height = " + height(root));
    }
}
