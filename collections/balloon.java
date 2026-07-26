import java.util.*;

public class balloon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.next().toLowerCase();
        }

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }

        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result = entry.getKey();
                break;
            }
        }

        if (result.isEmpty()) {
            System.out.println("All colors are even");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}