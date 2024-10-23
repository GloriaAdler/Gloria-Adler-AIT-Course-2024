package classwork_23_10.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import static org.junit.jupiter.api.Assertions.*;
class SoldierTest {

    Soldier[] soldiers;//объявляем массив на уровне класса для видимости во всем классе

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("John", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88),
        };

    }//end of method

    //- отсортировать солдат "естественным" образом - по росту
    @Test
    void testNativeSorting (){
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers);//нативная сортировка/native, by default
        System.out.println("--------------------Print after native sorting--------------------");
        printArray(soldiers);
    }

    //- отсортировать по имени по алфавиту
    @Test
    void testSortingByName (){
        Comparator <Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorByName);//comparatorByName - это в данном случае способ сортировки (по имени)
        System.out.println("--------------------Print after sorting by name--------------------");
        printArray(soldiers);
    }

    //- отсортировать по имени в обратном порядке по алфавиту
    @Test
    void testSortingByName2 (){
        Comparator <Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                //return o2.getName().compareTo(o1.getName());//первый способ - поменять объекты местами
                return  - o1.getName().compareTo(o2.getName());//второй способ, более удобный, поставить минус перед первым объектом
            }
        };
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorByName);//comparatorByName - это в данном случае способ сортировки (по имени)
        System.out.println("--------------------Print after sorting by name--------------------");
        printArray(soldiers);
    }

    //- по весу
    @Test
    void testSortingByWeight (){
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (w1, w2) -> Double.compare(w1.getWeight(), w2.getWeight()));//w - без разницы, что здесь поставить, главное какие действия нужно сделать. Через класс-обёртку Double, потому что вес содержит десятые, int с десятыми сортирует некорректно.
        System.out.println("--------------------Print after sorting by weight--------------------");
        printArray(soldiers);
    }

    //сортировка по алфавиту и росту/two and more factors for sorting
    @Test
    void testByNameAndHeight (){
        Comparator <Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo( o2.getName());//сравнили сначала по имени. Так как нужен int результат, то используем для стринговых значений compareTo
                return res !=0 ? res : Integer.compare(o1.getHeight(), o2.getHeight());//Это тернарный оператор!!! если это не равно res !=0 ?, возвращаем res, иначе - : - Integer.compare(o1.getHeight(), o2.getHeight()) - сортируем по росту
            }
        };
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorNameAndHeight);
        System.out.println("--------------------Print after sorting by name and height--------------------");
        printArray(soldiers);
    }

    //- по значению profile и по росту
    @Test
    void testSortSoldiersByProfile() {
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (o1, o2) -> {
            int res = -(o1.getProfile() - o2.getProfile()); // sort by Profile
            return res != 0 ? res : Integer.compare(o1.getHeight(), o2.getHeight());
        });
        System.out.println("--------------------Print after sorting by profile and height--------------------");
        printArray(soldiers);
    }

    //- проверить работу метода binarySearch на массиве объектов
    @Test
    void testBinarySearch (){
        System.out.println("--------------------Print as is--------------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (o1, o2) -> (o1.getProfile()- o2.getProfile()));
        System.out.println("--------------------Print after sorting by profile--------------------");
        printArray(soldiers);
        //create object - pattern for searching
        Soldier pattern = new Soldier(null, 0, 0, 91);//образец для поиска

        int index = Arrays.binarySearch(soldiers, pattern, (o1, o2) -> (o1.getProfile()- o2.getProfile()));//копируем лямду из 117 стр
        System.out.println("Index = " + index);
    }













    //метод заготовка для печати
    public void printArray (Object[]array){//Object - прадед всех наших объектов, таким образом этот тип становиться универсальным (он общий), все объекты которые мы будем заводить, они будут наследовать этот метод для печати
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}//end of class