import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SArray {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        
        // Shuffle the array
        Collections.shuffle(list);
        
        // Print shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
    }
}
