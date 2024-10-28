package homework_18_10.product.dau;

import homework_18_10.product.model.Car;

public interface Product {

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
