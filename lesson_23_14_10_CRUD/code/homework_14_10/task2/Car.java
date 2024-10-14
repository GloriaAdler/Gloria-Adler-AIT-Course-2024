package homework_14_10.task2;

import java.util.Objects;

//Задача 2. Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км.
//Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?
public class Car {

    private String carBrand;
    private char fuelType; // 'd' - дизель, 'b' - бензин
    private double fuelPrice;//d - 1.6, b - 1.8
    private double fuelConsumption;//Consumption - Потребление
    private double rentalCost;

    // Конструктор
    public Car(String carBrand, char fuelType, double fuelPrice, double fuelConsumption, double rentalCost) {
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.fuelPrice = fuelPrice;
        this.fuelConsumption = fuelConsumption;
        this.rentalCost = rentalCost;
    }

    // Метод для расчёта общей стоимости поездки
    public double calculateTotalCost(double distance) {
        double fuelNeeded = (distance / 100) * fuelConsumption; // Рассчитываем нужное количество топлива
        double fuelCost = fuelNeeded * fuelPrice; // Рассчитываем стоимость топлива
        return fuelCost + rentalCost; // Общая стоимость (топлива + аренда)
    }

    public String getCarBrand() {
        return carBrand;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return fuelType == car.fuelType && Double.compare(fuelPrice, car.fuelPrice) == 0 && Double.compare(fuelConsumption, car.fuelConsumption) == 0 && Double.compare(rentalCost, car.rentalCost) == 0 && Objects.equals(carBrand, car.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, fuelType, fuelPrice, fuelConsumption, rentalCost);
    }
}
