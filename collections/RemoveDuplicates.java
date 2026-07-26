import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        LinkedHashSet<String> result = new LinkedHashSet<>();

        for (String s : input) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
