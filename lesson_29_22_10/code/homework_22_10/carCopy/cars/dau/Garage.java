package homework_22_10.carCopy.cars.dau;

import homework_22_10.carCopy.cars.model.Car;

public interface Garage {

    boolean addCar (Car car);
    Car removeCar (String regNumber);
    Car findCarByRegNumber (String regNumber);
    Car[] findCarsByModel (String model);
    Car[] findCarsByCompany (String company);
    Car[] findCarsByEngine (double min, double max);
    Car[] findCarsByColor (String color);
    int size ();
    void printCars ();

    Car[] printAllCarsSortedByBrand ();
    Car[] printAllCarsSortedByColor ();
    Car[] printAllCarsSortedByCompany ();



}
