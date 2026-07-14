import java.util.*;

public class hashtable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<String, Integer> hp = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int id = sc.nextInt();

            hp.put(name, id);
        }

        System.out.println(hp);

        String target = sc.next();
        int newID = sc.nextInt();

        hp.put(target, newID);

        System.out.println(hp);

    }

}
