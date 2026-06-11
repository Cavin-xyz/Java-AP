import java.util.regex.*;
import java.util.Scanner;

public class RegularExp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String test = "^[a-zA-Z ]+$";
        if (Pattern.matches(test, name)) {
            System.out.println("Only alphabets");
        } else {
            System.out.println("Alphanumeric");
        }
    }
}
