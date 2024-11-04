package homework.product.test;
import homework.product.dau.Product;
import homework.product.dau.ProductImpl;
import homework.product.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Product garage;
    private Car[] cars;//можно здесь определить, а можно в 20 строчке указать массив Car [] cars, иначе тип cars будет светиться красным

    @BeforeEach
    void setUp() {
        garage = new ProductImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "BMW", "X3", "Company1", 1.5, "Red", 2010, 13000);
        cars[1] = new Car("Number2", "VW", "Golf", "Company1", 2.5, "Green", 2020, 20000);
        cars[2] = new Car("Number3", "BMW", "X5", "Company2", 1.5, "Red", 2021, 30000);
        cars[3] = new Car("Number4", "OPEL", "Astra", "Company2", 2.0, "Green", 2015, 10000);

        //TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest() {
        //check size
        assertEquals(4, garage.size());
        //can't add null
        assertFalse(garage.addCar(null));
        //can't add dublicate
        assertFalse(garage.addCar(cars[1]));
        //can add new car
        Car newCar = new Car("Number5", "BMW", "X2", "Company1", 1.5, "Red", 2010, 13000);
        assertTrue(garage.addCar(newCar));
        //check size
        assertEquals(5, garage.size());
        //can't add one more car
        Car oneMoreCar = new Car("Number6", "BMW", "X2", "Company1", 1.5, "Red", 2010, 13000);
        assertFalse(garage.addCar(oneMoreCar));
    }

    @Test
    void removeCarTest() {
        //can remove existed
        assertEquals(cars[1], garage.removeCar("Number2"));
        //check size
        assertEquals(3, garage.size());
        //can't remove absent
        assertNull (garage.removeCar("Number5"));
        //check size
        assertEquals(3, garage.size());
    }

    @Test
    void findCarsByRegNumberTest() {
        assertEquals(cars[0], garage.findCarByRegNumber("Number1"));
    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};//одинаковые модели
        Car[] actual = garage.findCarsByModel("BMW");
        assertArrayEquals(expected, actual);//сравниваем 2 массива assert!Array!Equals

    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[0], cars[1]};
        Car[] actual = garage.findCarsByCompany("Company1");
        assertArrayEquals(expected, actual);//сравниваем 2 массива assert!Array!Equals
    }

    @Test
    void findCarsByEngineTest() {
        double min = 1.0;  // Минимальный объем двигателя
        double max = 2.0;  // Максимальный объем двигателя
        // Ожидаем, что будут найдены машины с объемом двигателя между 1.0 и 2.0
        Car[] expected = {cars[0], cars[2]};// Автомобили с объемом двигателя 1.5
        Car[] actual = garage.findCarsByEngine(min, max);  // Вызов метода с корректными параметрами min и max
        assertArrayEquals(expected, actual);//сравниваем 2 массива assert!Array!Equals
    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {cars[1], cars[3]};
        Car[] actual = garage.findCarsByColor("Green");
        assertArrayEquals(expected, actual);//сравниваем 2 массива assert!Array!Equals

    }

    @Test
    void sizeTest (){
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest(){
        garage.printCars();
    }

}//end of class