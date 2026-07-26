import java.util.*;

//toStudy
public class Dyna {
    public static void main(String args[]) {
        int[] s1 = { 7, 0, 9, 10, 1 };
        int[] s2 = { 8, 4, 7, 5, 2 };
        int[][] back = new int[5][2];

        for (int i = 0; i < 5; i++) {
            back[i][0] = s1[i];
            back[i][1] = s2[i];
        }
        Arrays.sort(back, (x, y) -> Integer.compare(x[1], y[1]));
        for (int i = 0; i < 5; i++) {
            System.out.println(back[i][0] + " " + back[i][1]);
        }
    }

}
