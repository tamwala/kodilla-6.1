package stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private String continentName;
    private Set<Country> countrySet = new HashSet<>();

    public Continent(String name, Set<Country> country) {
        this.continentName = name;
        this.countrySet = country;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "county=" + countrySet +
                '}';
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }

    public Set<Country> getCountry() {
        return countrySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return countrySet.equals(continent.countrySet);
    }

    @Override
    public int hashCode() {
        return countrySet.hashCode();
    }


}
