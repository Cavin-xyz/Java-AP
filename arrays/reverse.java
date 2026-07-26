import java.util.*;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int ele : arr) {
            st.push(ele);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        for (int ele2 : arr) {
            System.out.print(ele2 + " ");
        }
        sc.close();
    }
}
