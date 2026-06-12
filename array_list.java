import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_list {
    public static void main(String args[]) {
        String[] eatable = { "apple", "orange" };
        String[] fullList = { "apple", "Match", "water", "orange" };

        List<String> fullListStrings = new ArrayList<>(Arrays.asList(fullList));
        List<String> eatableList = Arrays.asList(eatable);

        fullListStrings.retainAll(eatableList);
        System.out.println(fullListStrings);
    }

}
