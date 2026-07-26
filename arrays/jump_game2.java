import java.util.*;

public class jump_game2 {
    public static void main(String args[]) {
        int n = 5;
        int[] nums = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                ans++;
                break;
            }
            if (i == end) {
                ans++;
                end = farthest;
            }
        }
        System.out.print(ans);
        sc.close();
    }
}
