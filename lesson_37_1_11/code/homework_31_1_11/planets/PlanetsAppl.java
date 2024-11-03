package homework_31_1_11.planets;
//Вывести список планет отсортированный по:
//порядку расположения в солнечной системе;+
//алфавиту;+
//массе;+
//количеству спутников.+
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {
    public static void main(String[] args) {

        List <Planets> planets = new ArrayList<>();

        planets.add(new Planets("Earth", 149.6, 5.97e24, 1));//5970000000000000000000 тонн
        planets.add(new Planets("Mercury", 57.9, 3.3e23, 0));// 330000000000000000000 тонн
        planets.add(new Planets("Mars", 227.9, 6.42e23, 2));//642000000000000000000 тонн
        planets.add(new Planets("Jupiter", 778.5, 1.9e27, 79));//1900000000000000000000000 тонн
        planets.add(new Planets("Venus", 108.2, 4.87e24, 0));//4870000000000000000000 тонн
        planets.add(new Planets("Uranus", 2870, 8.68e25, 27));//86800000000000000000000 тонн
        planets.add(new Planets("Neptune", 4500, 1.02e26, 14));//102000000000000000000000 тонн
        planets.add(new Planets("Saturn", 1430, 5.68e26, 83));//568000000000000000000000 тонн

        // Сортировка по умолчанию по удалению планет от солнца
        System.out.println("====================Порядок расположения в солнечной системе====================");
        planets.sort(null);
        for (Planets planet : planets) {
            System.out.println(planet);
        }
        System.out.println("");

        // Сортировка по алфавиту
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("====================Сортировка по алфавиту====================");
        for (Planets planet : planets) {
            System.out.println(planet);
        }
        System.out.println("");

        // Сортировка по массе
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getMass(), o2.getMass()) ;
            }
        });
        System.out.println("====================Сортировка по массе====================");
        for (Planets planet : planets) {
            System.out.println(planet);
        }
        System.out.println("");

        // Сортировка по количеству спутников
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Integer.compare(o1.getNumberOfSatellites(),o2.getNumberOfSatellites());
            }
        });
        System.out.println("====================Сортировка по количеству спутников====================");
        for (Planets planet : planets) {
            System.out.println(planet);
        }

    }
}
