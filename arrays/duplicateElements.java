import java.util.*;

public class duplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int count = 0;
        for (int value : map.values()) {
            if (value > 1)
                count += value;
        }
        System.out.println(count);
        sc.close();
    }
}
