import java.util.*;

class LevelNode {
    int val;
    LevelNode left, right;

    LevelNode(int val) {
        this.val = val;
    }
}

public class LevelOrder {
    public static List<List<Integer>> levelOrder(LevelNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<LevelNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                LevelNode cur = q.poll();
                level.add(cur.val);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        LevelNode root = new LevelNode(1);
        root.left = new LevelNode(2);
        root.right = new LevelNode(3);
        root.left.left = new LevelNode(4);
        root.left.right = new LevelNode(5);
        root.right.right = new LevelNode(6);

        System.out.println(levelOrder(root));
    }
}
