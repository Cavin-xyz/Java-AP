import java.util.*;

public class Tree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            list.add(digit);
        }
        int k = sc.nextInt();
        Collections.sort(list);
        System.out.print("Before Deletion: ");
        for (int rev : list) {
            System.out.print(rev + " ");
        }
        System.out.println();
        list.remove(Integer.valueOf(k));
        System.out.print("After Deletion: ");
        for (int rev : list) {
            System.out.print(rev + " ");

        }

    }
}