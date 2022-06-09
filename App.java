import java.util.ArrayList;
import java.util.List;

/**
 * main
 */
public class App {

    public static void main(String[] args) {

        int[] array = { 1, 5, 2, 8, 3, 4 };
        int inversionCount = 0;

        List<Integer> pairs = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    inversionCount++;
                    pairs.add(array[i]);
                    pairs.add(array[j]);
                }

            }

        }
        System.out.println("Inversion count: " + inversionCount);
        System.out.println(pairs);

    }
}