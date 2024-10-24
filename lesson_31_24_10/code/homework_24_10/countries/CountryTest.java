package homework_24_10.countries;
//Задание 1. Взять на выбор любой из классов: Country - name, population River - name, length свой пример и выполнить с ним примеры по аналогии с City, которые мы делали на занятии.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;

class CountryTest {

    Country [] countries;

    @BeforeEach
    void setUp() {

        countries = new Country[10];

        countries [0] = new Country("China", 1400050000);
        countries [1] = new Country("India", 1407563000);
        countries [2] = new Country("United States", 336040000);
        countries [3] = new Country("Indonesia", 277534000);
        countries [4] = new Country("Pakistan", 248171000);
        countries [5] = new Country("Nigeria", 227074000);
        //countries [6] = new Country("Brazil", 216420000);
        countries [6] = new Country("Bangladesh", 175035000);
        countries [7] = new Country("Russia", 144712000);
        countries [8] = new Country("Mexico", 132049000);
        countries [9] = new Country("Japan", 123294000);

    }

    //сортировка по "умолчанию"
    @Test
    void testComparable (){
        printArray(countries, "List of countries sa is");
        Arrays.sort(countries);
        printArray(countries,"List of countries sorted by population");
        Country pattern = new Country (null, 216420000);// в ответе индекс после сортировки [-5]
        int index = Arrays.binarySearch(countries, pattern);
        System.out.println(index);

    }

    //Отсортировать список по алфавиту.
    @Test
    void testComparatorByName (){
        Comparator<Country> comparatorByCountryName = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(countries, comparatorByCountryName);
        printArray(countries, "List of countries sorted by name");
        Country pattern = new Country("Russia", 0);
        int index = Arrays.binarySearch(countries, pattern, comparatorByCountryName);
        if (index > 0){
            System.out.println("Find country " + pattern.getName() + "on index." + index);
        }else {
            System.out.println("Country " + pattern.getName() + "did not find, but it could be on index " + (-index-1));// в ответе индекс после сортировки [8]
        }
    }

    //копирование массива в другой массив
    @Test
    void testArrayCopy (){

        Country [] countriesCopy = Arrays.copyOf(countries, countries.length*2);
        printArray(countriesCopy, "CountriesCopy as is");
        System.out.println(countriesCopy.length);
        Comparator<Country> comparatorByName = Comparator.nullsLast ((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort (countriesCopy,comparatorByName);
        //print
        printArray(countriesCopy, "CountriesCopy after sorting by name");

        Country pattern = new Country ("Brazil", 0);
        int index = Arrays.binarySearch(countriesCopy,0, countries.length, pattern, comparatorByName);// в ответе индекс после сортировки [-3]
        System.out.println(index);
    }

    //Вставить Бразилию в список, сохранив порядок сортировки по населению!
    //вставляем в имеющийся массив
    @Test
    void testInsertKeepSorting (){
        Arrays.sort(countries);
        printArray(countries, "Native sorting");
        //нужно увеличить массив на один элемент, чтобы добавить новую страну
        Country [] countriesCopy11 = Arrays.copyOf(countries, countries.length+1);
        Country country = new Country("Brazil", 216420000);
        int index = Arrays.binarySearch(countriesCopy11, 0, countriesCopy11.length-1, country);
        index = index >= 0 ? index : -index-1;//обработка индекса
        System.arraycopy(countriesCopy11, index, countriesCopy11, index + 1, countriesCopy11.length - index-1);
        countriesCopy11[index] = country;
        countries = countriesCopy11;//переопределили ссылку на массив
        printArray(countries, "List with added country");

    }

    //метод - заготовка для печати
    public void printArray (Object[]array, String titleOfReport){
        System.out.println("-------------------------------" + titleOfReport + "-------------------------------");//titleOfReport - сразу в методе будем писать сообщение
        for (int i = 0; i < array.length; i++) {//1й способ, через фори
            System.out.println(array[i]);
        }
    }


}//end of class