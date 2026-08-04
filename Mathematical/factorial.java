import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;

        System.out.print("Factorial series up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiplies the previous factorial by the loop index
            System.out.print(factorial + (i < n ? ", " : ""));
        }
    }
}
