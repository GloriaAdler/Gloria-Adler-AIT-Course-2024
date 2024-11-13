package homework_44_12_11.travelAgency;

import java.util.List;

public class Tourist {

    private final String name;
    private final List<List<String>> countries;

    public Tourist(String name, String... countries) {
        this.name = name;
        this.countries = List.of(List.of(countries));
    }


    public String getName() {
        return name;
    }

    public List<List<String>> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tourist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", countries=").append(countries);
        sb.append('}');
        return sb.toString();
    }
}