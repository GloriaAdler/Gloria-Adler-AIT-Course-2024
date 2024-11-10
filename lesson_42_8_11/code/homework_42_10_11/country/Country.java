package homework_42_10_11.country;
import java.util.HashMap;
import java.util.Map;
//Задание 1. Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли. Подсчитайте количество стран на континентах из полученного списка.
public class Country {

    public static void main(String[] args) {

        // карта стран и континентов
        Map<String, String> country = new HashMap();

        country.put("Deutschland", "Europa");
        country.put("Italia", "Europa");
        country.put("Luxemburg", "Europa");
        country.put("Monaco", "Europa");
        country.put("Portugal", "Europa");
        country.put("Frankreich", "Europa");
        country.put("Brazil", "Südamerika");
        country.put("Venezuela", "Südamerika");
        country.put("Bolivia", "Südamerika");
        country.put("Argentina", "Südamerika");
        country.put("USA", "Nordamerika");
        country.put("Canada", "Nordamerika");
        country.put("Mexico", "Nordamerika");
        country.put("Australia", "Australia");
        country.put("Angola", "Africa");
        country.put("Morocco", "Africa");
        country.put("Chad", "Africa");
        country.put("Sudan", "Africa");
        country.put("Egypt", "Africa");
        country.put("China", "Asia");
        country.put("India", "Asia");
        country.put("Mongolia", "Asia");

        // карта для хранения кол-ва стран на каждом континенте
        Map<String, Integer> continentCount = new HashMap<>();

        // считаем страны на каждом континенте
        for (String continent : country.values()) {
            continentCount.put(continent, continentCount.getOrDefault(continent, 0) + 1);//getOrDefault - позволяет получить текущее значение для континента или вернуть 0, если его ещё нет в continentCount
        }

        System.out.println("The number of countries on each continent:");
        for (Map.Entry<String, Integer> entry : continentCount.entrySet()) {//Map.Entry содержит как ключ, так и значение, связанные друг с другом. Используется для итерации по Map: позволяет обойти каждую пару ключ-значение с помощью entrySet().
            System.out.println(entry.getKey() + ": " + entry.getValue());//entry.getKey() - возвращает ключ из пары (в нашем случае — название континента), entry.getValue() - возвращает значение, связанное с этим ключом (кол-во стран на этом континенте).
        }









    }
}
