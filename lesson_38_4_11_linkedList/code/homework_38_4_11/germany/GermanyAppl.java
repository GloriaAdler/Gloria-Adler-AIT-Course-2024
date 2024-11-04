package homework_38_4_11.germany;
//Задача 2. В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии.+
// Опробовать на нем методы, которые доступны для класса LinkedList.
// Добавить вольный город Гамбург в начало, в середину списка, в конец списка.+
// Отсортировать список по алфавиту и в обратном порядке.++
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class GermanyAppl {
    public static void main(String[] args) {

        List<String> cities = new LinkedList<>(Arrays.asList("Berlin", "Hamburg", "Munich", "Stuttgart", "Hannover", "Düsseldorf", "Mainz", "Saarbrücken", "Wiesbaden", "Potsdam", "Erfurt", "Magdeburg", "Kiel", "Schwerin", "Bremen", "Dresden"));

        System.out.println("===================== list of cities =====================");
        System.out.println(cities);
        System.out.println();

        System.out.println("===================== Hamburg =====================");
        cities.remove("Hamburg");//удаляем, чтобы не было дублей
        cities.addFirst("Hamburg");
        System.out.println(cities);

        cities.remove("Hamburg");//удаляем, чтобы не было дублей
        cities.addLast("Hamburg");
        System.out.println(cities);

        cities.remove("Hamburg");//удаляем, чтобы не было дублей
        int middleIndex = cities.size()/2;
        cities.add (middleIndex, "Hamburg");
        System.out.println(cities);
        System.out.println();

        System.out.println("===================== list of cities alphabetically =====================");
        Collections.sort(cities);
        System.out.println(cities);
        System.out.println();

        System.out.println("===================== list of cities in reverse order =====================");
        Collections.sort(cities, Collections.reverseOrder());
        System.out.println(cities);
        System.out.println();

    }
}
