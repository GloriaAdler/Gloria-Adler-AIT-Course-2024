package classwork_43_11_11.CarStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Задание 3. Класс Car (regNumber, brand, age, color) и работа со списком объектов класса:
//
//Перебор всех элементов carList с помощью forEach() и вывод их в консоль
//Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль:
//Из регистрационного номера - достаньте только буквы
//Сортировка списка по полю age
//Сортировка списка по нескольким свойствам: brand, age, color.
//Рассчитать средний возраст автомобилей
//Сделать проверку, что у всех Car возраст (age) больше 5 лет.
//Определить количество машин разных цветов
public class CarStreamAppl {
    public static void main(String[] args) {

        List<CarStream> cars = Arrays.asList(
                new CarStream("AB123CD", "Audi", 8, "Red"),
                new CarStream("EF456GH", "Mercedes", 3, "Black"),
                new CarStream("IJ789KL", "Audi", 10, "Blue"),
                new CarStream("MN012OP", "Tesla", 3, "Green"),
                new CarStream("QR345ST", "Volkswagen", 6, "Red"),
                new CarStream("UV678WX", "Tesla", 2, "Green"));

        printCars (cars);
        System.out.println("-----------------------------------------");
        printLettersOfRegNumber (cars);
        System.out.println("---------------Cars sorted by age--------------------------");
        List<CarStream> carByAge =sortCarsByAge (cars);
        printCars(carByAge);
        System.out.println("---------------Cars sorted by brand, age color--------------------------");
        List<CarStream>carsSorted = sortCarsByBrandAgeColor(cars);
        printCars(carsSorted);
        System.out.println("---------------Cars collecting by color--------------------------");
        Map<String, List<CarStream>> carsByColor = cars.stream()
                .collect(Collectors.groupingBy(CarStream::getColor));

        for (String color : carsByColor.keySet()) {
            System.out.println("Color " + color + " , cars: " + carsByColor.get(color).size());
        }

    }

    private static List<CarStream> sortCarsByBrandAgeColor(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getBrand)
                        .thenComparing(CarStream::getAge)
                        .thenComparing(CarStream::getColor)
                )
                .toList();
    }

    private static List<CarStream> sortCarsByAge(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getAge))
                .toList();
    }

    private static void printLettersOfRegNumber(List<CarStream> cars) {
        printCars(cars.stream()
                .map(carStream -> {
                    return new CarStream(
                    carStream.getRegNumber().substring(0,2),
                    carStream.getBrand(),
                    carStream.getAge(),
                    carStream.getColor()
                    );
                })
                .toList()
        );
    }

    private static void printCars(List<CarStream> cars) {
        cars.stream()
                .forEach(c -> System.out.println(c));
    }
}
