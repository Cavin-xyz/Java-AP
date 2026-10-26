import java.util.*;

class playground {
    public int findMonth(int N, int[][] arr) {

        int min = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[j][i];

            }
            if (sum < min) {
                min = sum;
                res = i;
            }
        }
        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][12];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        playground obj = new playground();

        System.out.println(obj.findMonth(N, arr));
    }
}