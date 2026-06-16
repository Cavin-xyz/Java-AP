import java.util.*;

public class pushzero {
    public static void pushZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pushZeros(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}
