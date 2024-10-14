package homework_14_10.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

//протестируем корректность работы метода для расчета стоимости поездки
    private Car dieselCar;
    private Car benzineCar;
    private double distance;

    @BeforeEach
    void setUp() {// Инициализируем объекты перед каждым тестом, на примере двух первых авто
        dieselCar = new Car("Audi", 'd', 1.6, 6.6, 45);
        benzineCar = new Car("BMW", 'b', 1.8, 6.8, 49);
        distance = 3000; // Общее расстояние в км для расчета стоимости
    }

    @Test
    public void testCalculateTotalCostDieselCar() {
        double expectedCost = 1.6 * (6.6 / 100) * distance + 45;// Ожидаемая стоимость поездки на дизельном автомобиле
        double actualCost = dieselCar.calculateTotalCost(distance);
        assertEquals(expectedCost, actualCost, 0.01);//delta - допустимое отклонение между ожидаемым и фактическим значением, если его не ввести, тест падает, так как есть отклонение из-за математического округления
    }

    @Test
    public void testCalculateTotalCostBenzineCar() {
        double expectedCost = 1.8 * (6.8 / 100) * distance + 49; // Ожидаемая стоимость поездки на бензиновом автомобиле
        double actualCost = benzineCar.calculateTotalCost(distance);
        assertEquals(expectedCost, actualCost, 0.01);
    }

    @Test
    public void testGetCarBrand() {//тест на верное определение марки авто
        assertEquals("Audi", dieselCar.getCarBrand());
        assertEquals("BMW", benzineCar.getCarBrand());
    }

    @Test
    public void testFuelCost() {//тест на верное определение стоимости топлива
        assertEquals(1.6, dieselCar.getFuelPrice());
        assertEquals(1.8, benzineCar.getFuelPrice());
    }

    @Test
    public void testFuelConsumption() {//тест на верной расход топлива
        assertEquals(6.6, dieselCar.getFuelConsumption());
        assertEquals(6.8, benzineCar.getFuelConsumption());
    }

    @Test
    public void testRentalCost() {//тест на верное использование стоимости аренды
        assertEquals(45, dieselCar.getRentalCost());
        assertEquals(49, benzineCar.getRentalCost());
    }
}