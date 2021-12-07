import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        List<city> cities = List.of(
                new city("New York", "USA"),
                new city("Washington", "USA"),
                new city("Prague", "Czech"),
                new city("Ostrava", "Czech"),
                new city("Warsaw", "Poland"),
                new city("Kraków", "Poland"),
                new city("Riga", "Latvia")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (city city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}