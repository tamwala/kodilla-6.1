package stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] numbers = new int[] {3,4};

        //When
        OptionalDouble result = ArrayOperations.getAverage(numbers);
        OptionalDouble exptectedResult = OptionalDouble.of(3.5);

        //Then
        assertEquals(result, exptectedResult);
    }
}
