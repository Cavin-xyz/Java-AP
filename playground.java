import java.util.*;
public class playground {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    int target = sc.nextInt();

    int result [] = twoSum(arr, target);
    System.out.println(Arrays.toString(result));
        
    }

public static int[] twoSum(int[] arr, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {

        int needed = target - arr[i];

        if (map.containsKey(needed)) {
            return new int[]{map.get(needed), i};
        }

        map.put(arr[i], i);
    }

    return new int[]{-1, -1};
}
    
}
