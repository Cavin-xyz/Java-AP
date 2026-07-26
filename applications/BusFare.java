import java.util.*;

public class BusFare {
    public static void main(String args[]) {

        String city[] = { "chennai", "vellore", "krishnagiri", "hosur", "bangalore" };
        int dist[] = { 100, 120, 60, 50 };

        Map<String, Integer> fare = new HashMap<>();
        int total = 0;

        fare.put(city[0], 0);

        for (int i = 1; i < city.length; i++) {
            total += dist[i - 1];
            fare.put(city[i], total);

        }
        double fkm = 1.5;
        Scanner sc = new Scanner(System.in);
        String d1 = sc.nextLine();
        d1 = d1.toLowerCase();
        String d2 = sc.nextLine();
        d2 = d2.toLowerCase();
        calculate(fare, d1, d2, fkm);

        sc.close();
    }

    static void calculate(Map<String, Integer> map, String from, String to, double fkm) {

        int distance = Math.abs(map.get(to) - map.get(from));

        double fare = distance * fkm;

        System.out.println(from + " to " + to);
        System.out.println("Distance = " + distance + " km");
        System.out.println("Fare = Rs." + fare);

    }

}

// fare.put("Vellore",100 );
// fare.put("Krishnagiri",120 );
// fare.put("Hosur",60 );
// fare.put("Bangalore",50 );
