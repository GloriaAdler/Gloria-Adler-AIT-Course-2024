package classwork_24_10.cities;
//City("Denver", 600_000);
//City("Boston", 670_000);
//City("Chicago", 2_700_000);
//City("Atlanta", 470_000);
//City("New York", 8_500_000);
//City("Dallas", 1_300_000);
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {

        cities = new City[6];

        cities [0] = new City("Denver", 600_000);
        cities [1] = new City("Boston", 670_000);
        cities [2] = new City("Chicago", 2_700_000);
        cities [3] = new City("Atlanta", 470_000);
        cities [4] = new City("New York", 8_500_000);
        cities [5] = new City("Dallas", 1_300_000);
    }

    //Распечатать в отсортированном виде.
    //Есть ли в списке городов город с населением 1.2 млн человек?
    //Отсортируйте список по алфавиту.
    //Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

    //сортировка по "умолчанию"
    @Test
    void testComparable (){
        printArray(cities, "List of cities sa is");
        Arrays.sort(cities);
        printArray(cities,"List of cities sorted by population");
        //City pattern = new City(null, 1200000);//в ответе индекс после сортировки [-4], так как такого примера для сравнения нет, индекс ВСЕГДА будет отрицательный, далее нужно поменять знак на противоположный и вычесть 1 (-4 => 4-1=3), в итоге город с населением 1,2 млн стоял БЫ на индексе [3], если бы у нас такой город с таким населением был.
        City pattern = new City(null, 600000);// в ответе индекс после сортировки [1]
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println(index);
        //printArray(cities, "List of cities sorted");
    }

    //Отсортируйте список по алфавиту.
    @Test
    void testComparatorByName (){
        Comparator <City> comparatorByCityName = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(cities, comparatorByCityName);//Arrays - наш массив - .sort - хотим отсортировать - cities - наши города - , comparatorByCityName - с помощью компоратора
        printArray(cities, "List of cities sorted by name");
        City pattern = new City("Atlanta", 0);
        int index = Arrays.binarySearch(cities, pattern, comparatorByCityName);
        if (index > 0){
            System.out.println("Find city " + pattern.getName() + "on index." + index);
        }else {
            System.out.println("City " + pattern.getName() + "did not find, but it could be on index " + (-index-1));
        }
    }

    //Скопируйте массив в другой, имеющий в 2 раза большую длину.
    //Отсортируйте полученный массив.
    //Имеется ли в списке городов город Salem?
    //"Salem", 690_000

    @Test
    void testArrayCopy (){
        City [] citiesCopy = Arrays.copyOf(cities, cities.length*2);
        printArray(citiesCopy, "Cities copy as is");
        System.out.println(citiesCopy.length);
        Comparator<City> comparatorByName = Comparator.nullsLast ((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort (citiesCopy,comparatorByName);
        //print
        printArray(citiesCopy, "citiesCopy after sorting by name");

        City pattern = new City ("Salem", 0);
        int index = Arrays.binarySearch(citiesCopy,0, cities.length, pattern, comparatorByName);
        System.out.println(index);
    }

    //Вставьте город Salem в список, сохранив порядок сортировки по населению!
    //вставляем в имеющийся массив
    @Test
    void testInsertKeepSorting (){
        Arrays.sort(cities);
        printArray(cities, "Native sorting");
        //нужно увеличить массив на один элемент, чтобы добавить новый город / incriase up to 7
        City [] citiesCopy7 = Arrays.copyOf(cities, cities.length+1);
        City city = new City("Salem", 690_000);
        int index = Arrays.binarySearch(citiesCopy7, 0, citiesCopy7.length-1, city);
        index = index >= 0 ? index : -index-1;//обработка индекса, на все случаи жизни
        System.arraycopy(citiesCopy7, index, citiesCopy7, index + 1, citiesCopy7.length - index-1);
        citiesCopy7[index] = city;
        cities = citiesCopy7;//переопределили ссылку на массив, теперь наш массив содержит 7 городов
        printArray(cities, "List with added city");



    }











    //метод - заготовка для печати

    public void printArray (Object[]array, String titleOfReport){//Object - прадед всех наших объектов, таким образом этот тип становиться универсальным (он общий), все объекты которые мы будем заводить, они будут наследовать этот метод для печати
        System.out.println("-------------------------------" + titleOfReport + "-------------------------------");//titleOfReport - сразу в методе будем писать сообщение
        for (int i = 0; i < array.length; i++) {//1й способ, через фори
            System.out.println(array[i]);
        }
//        for (Object o : cities) {//2й способ, через форич
//            System.out.println(o);
//        }
    }
}