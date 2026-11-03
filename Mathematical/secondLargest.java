import java.util.*;

class secondLargest {
    public int secondLargest(int N) {

        int lar = -1;

        int slar = -1;

        while (N > 0) {

            int dig = N % 10;

            if (dig > lar) {
                slar = lar;
                lar = dig;
            } else if (dig > slar && dig < lar) {
                slar = dig;
            }

            N /= 10;

        }
        return slar;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        secondLargest obj = new secondLargest();

        System.out.println(obj.secondLargest(N));
    }
}