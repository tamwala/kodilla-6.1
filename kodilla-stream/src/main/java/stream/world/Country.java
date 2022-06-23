package stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryName;
    private BigDecimal peopleQuantity;


    public Country(String name, BigDecimal peopleQuantity) {
        this.countryName = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryName.equals(country.countryName)) return false;
        return peopleQuantity.equals(country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + peopleQuantity.hashCode();
        return result;
    }
}
