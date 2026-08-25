import java.util.*;

public class minimumTruckCapacity {

    // This method checks:
    // "If the truck has the given capacity,
    // can we deliver all packages within the given number of days?"
    static boolean canShip(int[] weights, int capacity, int days) {

        // Stores how much weight is currently loaded
        // onto the truck for the current day.
        int currentLoad = 0;

        // We start with Day 1.
        int requiredDays = 1;

        // Go through every package one by one.
        for (int weight : weights) {

            // Check if adding this package would exceed
            // the truck's maximum capacity.
            if (currentLoad + weight > capacity) {

                // The current truck/day is full,
                // so we need another day.
                requiredDays++;

                // Start the new day's truck with nothing.
                currentLoad = 0;
            }

            // Put the current package into the truck.
            currentLoad += weight;
        }

        // If the number of days we need is less than
        // or equal to the number of days available,
        // then this capacity is possible.
        return requiredDays <= days;
    }


    // This method finds the minimum truck capacity
    // required to deliver all packages within the given days.
    static int minimumCapacity(int[] weights, int days) {

        // This will store the heaviest package.
        int maxWeight = 0;

        // This will store the total weight of all packages.
        int totalWeight = 0;


        // Go through every package.
        for (int weight : weights) {

            // Find the heaviest single package.
            maxWeight = Math.max(maxWeight, weight);

            // Add the package weight to the total.
            totalWeight += weight;
        }


        // The truck capacity can NEVER be smaller
        // than the heaviest package.
        //
        // Example:
        // If one package weighs 40,
        // capacity cannot be 30.
        int low = maxWeight;


        // In the worst case, we could carry
        // every package in one day.
        //
        // Therefore, the total weight is the
        // maximum possible capacity.
        int high = totalWeight;


        // Continue searching while there is
        // more than one possible capacity.
        while (low < high) {

            // Find the middle capacity.
            //
            // This is safer than (low + high) / 2
            // because it avoids integer overflow.
            int mid = low + (high - low) / 2;


            // Ask:
            // "Can we ship everything within 'days'
            // if the truck capacity is 'mid'?"
            if (canShip(weights, mid, days)) {

                // YES!
                //
                // 'mid' works, so maybe we can use
                // an even smaller capacity.
                //
                // Therefore, move the upper boundary down.
                high = mid;

            } else {

                // NO!
                //
                // 'mid' is too small.
                //
                // We need a larger capacity.
                //
                // So move the lower boundary up.
                low = mid + 1;
            }
        }


        // When low == high,
        // we have found the smallest capacity
        // that actually works.
        return low;
    }


    // Program execution starts here.
    public static void minimumCapacity(String[] args) {

        // Weight of each package.
        int[] weights = {10, 20, 30, 40};

        // We have 2 days to deliver everything.
        int days = 2;


        // Call our method to find the minimum
        // truck capacity required.
        int answer = minimumCapacity(weights, days);


        // Print the answer.
        System.out.println("Minimum capacity = " + answer);
    }
}