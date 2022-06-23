package stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private Set<Continent> continentSet = new HashSet<>();

    public World(Set<Continent> continent) {
        this.continentSet = continent;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal population = continentSet.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        return continentSet.equals(world.continentSet);
    }

    @Override
    public int hashCode() {
        return continentSet.hashCode();
    }

    @Override
    public String toString() {
        return "World{" +
                "continent=" + continentSet +
                '}';
    }
}
