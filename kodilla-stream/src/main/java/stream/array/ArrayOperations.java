package stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble avg = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        return avg;
    }
}
