package homework_31_1_11.computer;
//Задача 1. На основе класса Computer:
        //создать собственный ArrayList; +
        //добавить в него не менее 6 элементов; +
        //отсортировать список по *бренду*; +
        //отсортировать список по размеру *RAM*, затем размеру *SSD* при равенстве RAM;+
        //подсчитать общий суммарный объем и среднее значение SSD. +
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerAppl {

    public static void main(String[] args) {

        List <Computer> computers = new ArrayList<>();

        computers.add(new Computer(16, 1024, "Asus"));
        computers.add(new Computer(8, 256, "Aser"));
        computers.add(new Computer(32, 1024, "Apple"));
        computers.add(new Computer(16, 512, "Lenovo"));
        computers.add(new Computer(8, 512, "Asus"));
        computers.add(new Computer(8, 128, "Lenovo"));
        computers.add(new Computer(32, 512, "HP"));
        computers.add(new Computer(64, 1024, "Dell"));
        computers.add(new Computer(16, 512, "Asus"));
        computers.add(new Computer(16, 256, "HP"));

        // Сортировка по умолчанию на основе compareTo из класса Computer
        System.out.println("====================sorting====================");
        computers.sort(null);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("");

        //Сортировка по бренду
        System.out.println("====================Sorting computers by brand ====================");
        computers.sort(Comparator.comparing(Computer::getBrand));// Comparator.comparing -> статический метод comparing из класса Comparator создает компаратор, который сравнивает объект Computer по определенному полю (в нашем случае - brand) или методу. Computer::getBrand —> это ссылка на метод getBrand класса Computer, который возвращает значение поля brand для каждого объекта Computer. Компаратор с использованием Computer::getBrand будет сравнивать объекты Computer по значению в алфавитном порядке, возвращаемому методом getBrand (то есть по полю brand).
        for (Computer computer : computers) {//циклом for each перебираем элементы из коллекции computers (список объектов типа Computer). Computer computer - переменная computer типа Computer. Каждый раз, когда цикл выполняется, computer будет принимать значение следующего элемента из этой коллекции, таким образом пройдя по всей коллекции.
            System.out.println(computer);//печатаем отсортированный по бренду массив
        }
        System.out.println("");

        //Сортировка по размеру RAM (выше сделана, как по умолчанию), затем размеру SSD при равенстве RAM;
        Comparator <Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int res = o1.compareTo(o2);//без getSsd, так как compareTo уже по умолчанию сортирует здесь по RAM
                return res !=0 ? res : Integer.compare(o1.getSsd(), o2.getSsd());
            }
        };
        computers.sort(comparator);
        System.out.println("====================Sorting computers by RAM and SSD====================");
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("");

        //подсчитать общий суммарный объем и среднее значение SSD.
        int totalSSD = 0;
        for (Computer computer : computers) {
            totalSSD += computer.getSsd();
        }
        System.out.println("Total volume SSD " +totalSSD + " GB");

        double averageSSD = totalSSD / computers.size();//почему-то работает без кастинга: double averageSSD = (double) totalSSD / computers.size();
        System.out.println("Average volume SSD " + averageSSD + " GB");

    }
}
