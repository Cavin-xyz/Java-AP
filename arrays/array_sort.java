import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class array_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            list.add(digit);
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        sc.close();
    }

}
