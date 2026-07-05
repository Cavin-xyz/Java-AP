import java.util.*;

public class wordgame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        int maxlen = 0;
        String str = "";
        String res = "";

        for (int i = 0; i < n; i++) {
            str = arr[i];
            maxlen = str.length();
            if (maxlen % 2 != 0) {
                res = arr[i];
            }
        }

        System.out.println(res);
    }

}
