package homework_22_10.carCopy.cars.car_sorting;
import homework_22_10.carCopy.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;
class CarTest {

    Car [] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[4];
        cars[0] = new Car("Number1", "BMW", "Company1", 1.5, "Red", 2010, 13000);
        cars[1] = new Car("Number2", "VW", "Company1", 2.5, "Green", 2020, 20000);
        cars[2] = new Car("Number3", "BMW", "Company2", 1.5, "Red", 2021, 30000);
        cars[3] = new Car("Number4", "OPEL", "Company2", 2.0, "Green", 2015, 10000);
    }

    @Test
    void sortCarByAgeTest () {
        System.out.println("--------------------List cars as is------------------");
        printCars();

        Arrays.sort(cars);//sorting

        System.out.println("--------------------List cars sorted by age------------------");
        printCars();
    }

    @Test
    void sortCarsByPriceTest (){
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getPrice(), c2.getPrice());//через класс-обёртку Double
            }
        };
        System.out.println("--------------------List cars as is------------------");
        printCars();

        Arrays.sort(cars, comparatorByPrice);//sorting by price

        System.out.println("--------------------List cars sorted by price------------------");
        printCars();//print
    }

    @Test
    void sortCarsByModelTest (){
        Comparator <Car> comparatorByModel = new Comparator <> () {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());//compareTo - for String
            }
        };
        System.out.println("--------------------List cars as is------------------");
        printCars();

        Arrays.sort(cars, comparatorByModel);//sorting by model

        System.out.println("--------------------List cars sorted by model------------------");
        printCars();//print
    }

    @Test
    void sortCarsByColorTest (){
        Comparator <Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getColor().compareTo(c2.getColor());//compareTo - for String
            }
        };
        System.out.println("--------------------List cars as is------------------");
        printCars();

        Arrays.sort(cars, comparatorByColor);//sorting by model

        System.out.println("--------------------List cars sorted by color------------------");
        printCars();//print
    }

    void printCars() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

}//end of class