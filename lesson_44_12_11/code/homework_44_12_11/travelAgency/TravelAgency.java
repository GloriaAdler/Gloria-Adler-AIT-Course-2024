package homework_44_12_11.travelAgency;
//Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис. Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны. Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.
//Необходимо ответить на вопросы:
        //Какие страны наиболее популярны?
        //Кто из клиентов посетил наибольшее количество стран?
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class TravelAgency {

    private static final Set<String> MEDITERRANEAN_COUNTRIES = Set.of(
            "Spain", "France", "Italy", "Greece", "Turkey", "Tunis"
    );

    public static void main(String[] args) {

        List<Tourist> tourists = fillListTourists();
        tourists.forEach(System.out::println);

        //Какие страны наиболее популярны?
        System.out.println("Most popular countries:");
        findMostPopularCountries(tourists);

        //Кто из клиентов посетил наибольшее количество стран?
        System.out.println("\nTourist who visited the most countries:");
        findTopTourist(tourists);
    }

    private static List<Tourist> fillListTourists() {
        return List.of(
                new Tourist("Olesia", "Iran", "Kyrgyzstan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Netherlands", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatia", "Slovenia", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }

    private static void findMostPopularCountries(List<Tourist> tourists) {
        Map<List<String>, Long> countryPopularity = tourists.stream()
                .flatMap(tourist -> tourist.getCountries().stream())
                .filter(MEDITERRANEAN_COUNTRIES::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countryPopularity.entrySet().stream()
                .sorted(Map.Entry.<List<String>, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static void findTopTourist(List<Tourist> tourists) {
        tourists.stream()
                .collect(Collectors.toMap(
                        Tourist::getName,
                        tourist -> tourist.getCountries().stream()
                                .filter(MEDITERRANEAN_COUNTRIES::contains)
                                .distinct()
                                .count()
                ))
                .entrySet().stream()
                .max(comparingByValue())
                .ifPresent(entry -> System.out.println("Tourist: " + entry.getKey() + " visited " + entry.getValue() + " unique Mediterranean countries"));
    }

}
