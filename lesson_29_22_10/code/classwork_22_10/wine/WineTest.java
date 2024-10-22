package classwork_22_10.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine [] wines;

    @BeforeEach
    void setUp() {
        wines = new Wine[5];
        wines [0] = new Wine("type1", "AAA", 2021, 6);
        wines [1] = new Wine("type2", "CCC", 2024, 3);
        wines [2] = new Wine("type3", "XXX", 2022, 5);
        wines [3] = new Wine("type1", "OOO", 2015, 7);
        wines [4] = new Wine("type2", "SSS", 2000, 20);
    }

    @Test
    void sortWineByAgeTest (){
        System.out.println("--------------------List wines as is------------------");
        printWines();//print as is. printWines(); - этот метод тянется из теста ниже

        Arrays.sort(wines);//sorting

        System.out.println("--------------------List wines sorted by Age------------------");
        printWines();//print

    }

    @Test
    void sortWineByPriceTest (){
        Comparator <Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                //return (int) (w1.getPrice() - w2.getPrice()); // 1й способ, (int) - кастинг, т.к. getPrice определен как double, а нам нужен int compare
                return Double.compare(w1.getPrice(), w2.getPrice());//2й способ, через класс-обёртку Double
            }
        };
        System.out.println("--------------------List wines as is------------------");
        printWines();//print as is. printWines(); - этот метод тянется из теста ниже

        Arrays.sort(wines, comparatorByPrice);//sorting by price

        System.out.println("--------------------List wines sorted by Price------------------");
        printWines();//print
    }

    @Test
    void sortWinesByTitleTest (){
        Comparator <Wine> comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitle().compareTo(w2.getTitle());//compareTo - for String
            }
        };
        System.out.println("--------------------List wines as is------------------");
        printWines();//print as is. printWines(); - этот метод тянется из теста ниже

        Arrays.sort(wines, comparatorByTitle);//sorting by price

        System.out.println("--------------------List wines sorted by Title------------------");
        printWines();//print


    }


    @Test
    void printWines (){
        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }
}//end of class