import java.util.Arrays;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 3, 2};

        // Sort first 3 elements (index 0 to 2)
        Arrays.sort(numbers, 0, 3);
        System.out.println("Partially sorted array: " + Arrays.toString(numbers));

        // Convert to Integer[] for reverse sorting
        Integer[] numbersObj = {5, 4, 1, 3, 2};
        Arrays.sort(numbersObj, Collections.reverseOrder());
        System.out.println("Reverse sorted array: " + Arrays.toString(numbersObj));
    }
}
