package homework_14_10.task2;

public class Planner {
    public static void main(String[] args) {

        double distance = 3000;

        // Данные о машинах
        Car car1 = new Car("Audi", 'd', 1.6, 6.6, 45);
        Car car2 = new Car("BMW", 'b', 1.8, 6.8, 49);
        Car car3 = new Car("Opel", 'd', 1.6, 6.9, 45);
        Car car4 = new Car("VW", 'd', 1.6, 6.5, 39);
        Car car5 = new Car("Mercedes", 'b', 1.8, 6.3, 49);

        Car cheapestCar = null; // заводим переменную для отслеживания самого дешёвого варианта
        double minCost = Double.MAX_VALUE;// заводим через константу максимальное значение для сравнения

        // Считаем стоимость для каждого варианта
        double costCar1 = car1.calculateTotalCost(distance);
        System.out.println("Car " + car1.getCarBrand() + " total cost: " + costCar1 + " $");
        //сразу циклом if ищем самый экономичный
        if (costCar1 < minCost) {
            minCost = costCar1;
            cheapestCar = car1;
        }

        double costCar2 = car2.calculateTotalCost(distance);
        System.out.println("Car " + car2.getCarBrand() + " total cost: " + costCar2 + " $");
        if (costCar2 < minCost) {
            minCost = costCar2;
            cheapestCar = car2;
        }

        double costCar3 = car3.calculateTotalCost(distance);
        System.out.println("Car " + car3.getCarBrand() + " total cost: " + costCar3 + " $");
        if (costCar3 < minCost) {
            minCost = costCar3;
            cheapestCar = car3;
        }

        double costCar4 = car4.calculateTotalCost(distance);
        System.out.println("Car " + car4.getCarBrand() + " total cost: " + costCar4 + " $");
        if (costCar4 < minCost) {
            minCost = costCar4;
            cheapestCar = car4;
        }

        double costCar5 = car5.calculateTotalCost(distance);
        System.out.println("Car " + car5.getCarBrand() + " total cost: " + costCar5 + " $");
        if (costCar5 < minCost) {
            minCost = costCar5;
            cheapestCar = car5;
        }
        // Выводим самый экономичный автомобиль
        System.out.println("\nThe most economical car - " + cheapestCar.getCarBrand() + ", with total cost " + minCost + " $.");
    }
}
