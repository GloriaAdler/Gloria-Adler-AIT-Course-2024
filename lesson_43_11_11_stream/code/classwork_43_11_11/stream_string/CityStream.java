package classwork_43_11_11.stream_string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
//преобразуйте их в верхний регистр и выведите в алфавитном порядке.
//"Augsburg", "Munich", "Berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"
public class CityStream {
    public static void main(String[] args) {

        List <String> cityList = new ArrayList<>(Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"));//asList - метод "всё загнать в лист"

        char firstLetter = 'b';

        List <String> result = filterCities (cityList, firstLetter);
        result.forEach(System.out::println);
    }

    private static List<String> filterCities(List<String> cityList, char firstLetter) {
        return cityList.stream()
                .filter(city -> city.toLowerCase().startsWith(String.valueOf(firstLetter)))
                .map(String::toUpperCase)//всё с большой буквы
                .sorted()//по алфавиту
                .toList().reversed();//повернуть лист в обратном порядке, т.е. в обратном алфавитном порядке

    }

}
