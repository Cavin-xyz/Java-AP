public class MissingNumbers2 {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == mid + 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println(start + 1);

    }
}
