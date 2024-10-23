package homewoork_23_10.myClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    MyClass [] myClasses;

    @BeforeEach
    void setUp() {
        myClasses = new MyClass[]{
                new MyClass("AAA", 25, 11222333222L, 5000.9),
                new MyClass("BBB", 30, 11222333111L, 3500.5),
                new MyClass("CCC", 25, 11222333444L, 3600),
                new MyClass("AAA", 45, 11222333333L, 8800.7),
                new MyClass("DDD", 20, 11222333555L, 2000),
        };

    }

        //- отсортировать солдат "естественным" образом - по налоговому номеру
    @Test
    void testNativeSorting (){
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses);//нативная сортировка
        System.out.println("--------------------Print after native sorting--------------------");
        printArray(myClasses);
    }

    //- отсортировать по имени по алфавиту
    @Test
    void testSortingByName (){
        Comparator<MyClass> comparatorByName = new Comparator<MyClass>() {
            @Override
                public int compare(MyClass o1, MyClass o2) {
                     return o1.getName().compareTo(o2.getName());
                }
            };
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses, comparatorByName);
        System.out.println("--------------------Print after sorting by name--------------------");
        printArray(myClasses);
    }

    //- отсортировать по имени в обратном порядке по алфавиту
    @Test
    void testSortingByNameBack (){
        Comparator<MyClass> comparatorByName = new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses, comparatorByName);
        System.out.println("--------------------Print after sorting by name--------------------");
        printArray(myClasses);
    }

    //по доходу
    @Test
    void testSortingIncome (){
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses, (x1, x2) -> Double.compare(x1.getIncome(), x2.getIncome()));
        System.out.println("--------------------Print after sorting by income--------------------");
        printArray(myClasses);
    }

    //сортировка по имени и налоговому классу
    @Test
    void testByNameAndSteuernummer (){
        Comparator <MyClass> comparatorNameAndSteuernummer = new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res !=0 ? res : Integer.compare((int) o1.getSteuernummer(), (int) o2.getSteuernummer());//сделан кастинг
            }
        };
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses, comparatorNameAndSteuernummer);
        System.out.println("--------------------Print after sorting by name and steuernummer--------------------");
        printArray(myClasses);
    }

    //binarySearch
    @Test
    void testBinarySearch (){
        System.out.println("--------------------Print as is--------------------");
        printArray(myClasses);
        Arrays.sort(myClasses, ((o1, o2) -> (o1.getAge() - o2.getAge())));
        System.out.println("--------------------Print after sorting by age--------------------");
        printArray(myClasses);
        //create object - pattern for searching
        MyClass pattern = new MyClass(null, 25,0,0);//образец для поиска
        int index = Arrays.binarySearch(myClasses, pattern, (o1, o2) -> (o1.getAge() - o2.getAge()));
        System.out.println("Index = " + index);

    }


    //метод - заготовка для печати
    public void printArray (Object[]array){//Object - прадед всех наших объектов, таким образом этот тип становиться универсальным (он общий), все объекты которые мы будем заводить, они будут наследовать этот метод для печати
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
        }
    }

}//end of class