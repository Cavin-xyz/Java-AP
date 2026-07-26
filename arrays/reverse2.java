import java.util.*;

public class reverse2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            list.add(digit);
        }
        Collections.reverse(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
