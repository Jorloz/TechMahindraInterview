
import java.util.HashMap;
import java.util.Map;

public class exercise2 {

    private static final Map<Integer, Long> memo = new HashMap<>();

    public static long countWaysToClimb(int steps) {
        if (steps < 0) {
            return 0;
        }
        if (steps == 0) {
            return 1;
        }

        return calculateWays(steps);
    }

    private static long calculateWays(int steps) {

        if (memo.containsKey(steps)) {
            return memo.get(steps);
        }

        if (steps == 0) {
            return 1;
        }
        if (steps == 1) {
            return 1;
        }

        long result = calculateWays(steps - 1) + calculateWays(steps - 2);

        memo.put(steps, result);

        return result;
    }

    public static void main(String[] args) {
        int steps = 10;
        long ways = countWaysToClimb(steps);

        System.out.println("Number of ways to climb " + steps + " steps: " + ways);
    }

}
