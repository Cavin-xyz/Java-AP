import java.util.*;

class removeFirstandLast {
    public int findMonth(int N) {

        int div = 1;

        N /= 10;

        while (N / div >= 10) {
            div *= 10;

        }
        int res = N % div;

        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        removeFirstandLast obj = new removeFirstandLast();

        System.out.println(obj.findMonth(N));
    }
}