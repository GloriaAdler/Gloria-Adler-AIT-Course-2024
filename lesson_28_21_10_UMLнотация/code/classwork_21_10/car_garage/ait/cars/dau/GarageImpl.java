package classwork_21_10.car_garage.ait.cars.dau;

import classwork_21_10.car_garage.ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car [] cars;
    private int size;

    public GarageImpl(int campacity) {//нужно переделать стандартный конструктор под себя
        this.cars = new Car[campacity];
        this.size = size;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++){
            if (cars[i].getRegNumber().equals(regNumber)){//этот getRegNumber должен сравниться с String regNumber
                return cars[i];
            }

        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));//(car -> model.equals(car.getModel())) - нам нужен такой car, который car.getModel().equals(model) или model.equals(car.getModel()).    car.getModel().equals(model) или model.equals(car.getModel()) - это одно и тоже, записанное разными способами, кому как удобно
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }

    @Override
    public int size() {
        return size;//всегда вместо 0 пишем size (return 0 - стоит по умолчанию)
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate (Predicate <Car> predicate){//Predicate (проверяет какое-то условие) - логическое выражение
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){//здесь объект проходит тест с помощью единственного метода predicate
                count++;
            }
        }
        //читаем массив и перекладываем результаты в новый массив
        Car [] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }


}//end of class
