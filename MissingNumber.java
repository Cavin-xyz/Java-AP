import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findMissingNumber(nums));
    }
}
