import java.util.Scanner;

public class query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read n (the fixed divisor) and q (number of queries)
        int n = sc.nextInt();
        int q = sc.nextInt();

        // 2. Loop through each query dynamically
        for (int i = 0; i < q; i++) {
            // Read the start and end range for THIS specific query
            long start = sc.nextLong();
            long end = sc.nextLong();

            // 3. Execute the function and print the result immediately
            long result = countNonDivisible(start, end, n);
            System.out.println(result);
        }

        sc.close();
    }

    // O(1) Constant Time Function
    public static long countNonDivisible(long start, long end, int n) {
        // Total numbers in the range (inclusive)
        long totalNumbers = end - start + 1;

        // Count how many numbers up to 'end' are divisible by n
        long divisibleUpToEnd = end / n;

        // Count how many numbers up to 'start - 1' are divisible by n
        long divisibleUpToStartMinusOne = (start - 1) / n;

        // Divisible numbers exactly within [start, end]
        long totalDivisible = divisibleUpToEnd - divisibleUpToStartMinusOne;

        // Non-divisible numbers = Total - Divisible
        return totalNumbers - totalDivisible;
    }
}