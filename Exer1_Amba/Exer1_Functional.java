import java.util.Arrays;
import java.util.List;

public class FunctionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Functional approach: filter even numbers, square them, sum them
        int sumOfSquaresOfEvens = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvens);
    }
}
