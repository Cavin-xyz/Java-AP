public class Inverntory {

    public static void main(String args[]) {
        int arr[] = { 12, 9, 11, 10, 6, 10, 8, 2 };
        int order = 10;
        int carry = 0;
        for (int i = 0; i < arr.length; i++) {
            int available = arr[i] + carry;

            if (available >= order) {
                carry = available - order;
                System.out.println("Day" + (i + 1) + ":Order fulfilled" + " Carry" + carry);
            } else {
                System.out.println("Fulfillment stops on Day " + (i + 1));
                break;
            }

        }

    }
}
