import java.util.Arrays;
import java.util.List;

public class ImperativeSumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n * n;
            }
        }
        System.out.println(sum); // Output: 56
    }
}
