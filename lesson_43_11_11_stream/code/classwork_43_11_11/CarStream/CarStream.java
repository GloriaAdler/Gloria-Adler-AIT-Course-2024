package classwork_43_11_11.CarStream;
//Задание 3. Класс Car (regNumber, brand, age, color) и работа со списком объектов класса:
//
//Перебор всех элементов carList с помощью forEach() и вывод их в консоль
//Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль:
//Из регистрационного номера - достаньте только буквы
//Сортировка списка по полю age
//Сортировка списка по нескольким свойствам: brand, age, color.
//Рассчитать средний возраст автомобилей
//Сделать проверку, что у всех Car возраст (age) больше 5 лет
//Определить количество машин разных цветов
import java.util.Objects;

public class CarStream {

    private String regNumber;
    private String brand;
    private int age;
    private String color;

    public CarStream(String regNumber, String brand, int age, String color) {

        this.regNumber = regNumber;
        this.brand = brand;
        this.age = age;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarStream carStream)) return false;
        return age == carStream.age && Objects.equals(regNumber, carStream.regNumber) && Objects.equals(brand, carStream.brand) && Objects.equals(color, carStream.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, brand, age, color);
    }

    @Override
    public String toString() {
        return "CarStream{" +
                "regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
