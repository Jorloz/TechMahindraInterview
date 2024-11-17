
/**
 *
 * @author jorloz
 */
import java.util.Arrays;

public class exercise1 {

    public static long occurrences(int[] sortedArray, int target) {
        return Arrays.stream(sortedArray).filter(num -> num == target).count();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 3, 4, 5};
        int target = 3;
        int target2 = 2;
        long result = occurrences(sortedArray, target);
        System.out.println("Example 1: The number: " + target + ". Appears " + result + " on " + target);
        long result2 = occurrences(sortedArray, target2);
        System.out.println("Example 2: The number: " + target + ". Appears " + result2 + " on " + target2);
    }

}
