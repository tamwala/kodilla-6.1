package stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Polska", new BigDecimal("35"));
        Country country2 = new Country("Niemcy", new BigDecimal("30"));
        Country country3 = new Country("Chiny", new BigDecimal("50"));

        Continent continent1 = new Continent("Europa", Stream.of(country1, country2).collect(Collectors.toCollection(HashSet::new))); //referencja do konstruktora
        Continent continent2 = new Continent("Europa", Stream.of(country3).collect(Collectors.toCollection(HashSet::new))); //referencja do konstruktora

        World world1 = new World(Stream.of(continent1, continent2).collect(Collectors.toCollection(HashSet::new)));

        //When
        BigDecimal result = world1.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("115");

        //Then
        assertEquals(result, expectedResult);

    }


}
