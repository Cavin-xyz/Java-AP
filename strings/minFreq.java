import java.util.*;

public class minFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char ele : str.toCharArray()) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int count = 0;
        int curr = 0;
        for (int value : map.values()) {
            if (value > 1)
                count += value;
            count = Math.max(count,curr);
        }
        System.out.println(count);
    }
}
