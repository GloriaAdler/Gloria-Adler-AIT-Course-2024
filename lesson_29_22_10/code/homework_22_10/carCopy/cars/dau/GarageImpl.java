package homework_22_10.carCopy.cars.dau;

import homework_22_10.carCopy.cars.model.Car;

import java.util.Comparator;
import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
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
        for (int i = 0; i < size; i++) {
            if (cars [i].getRegNumber() == regNumber){
                Car victim = cars [i];
                cars [i] = cars [size-1];//на место жертвы копируем (ставим) последний элемент массива
                cars [size-1] = null;//последний элемент затрем с помощью null, [size] - это последняя пустая ячейка, поэтому -1
                size--;
                return victim;
            }
        }
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
    public Car[] findCarsByCompany(String company) {//Java понимает что идентификатор car (а он может быть каким угодно: с, са и т.д.) это Car[], когда у нас есть Predicate
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(car -> car.getEngine() > min && car.getEngine() < max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));
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

    @Override
    public Car[] printAllCarsSortedByColor() {//еще один способ создания сортирующего метода
        Comparator <Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getColor().compareTo(car2.getColor());
            }
        };
        return null;
    }

    @Override
    public Car[] printAllCarsSortedByBrand() {
        Comparator <Car> comparatorByBrand = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o1.getBrand());
            }
        };
        return null;
    }

    @Override
    public Car[] printAllCarsSortedByCompany() {
        Comparator <Car> comparatorByCompany = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getCompany().compareTo(o2.getCompany());
            }
        };
        return null;
    }

    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate (Predicate <Car> predicate){//Predicate (проверяет какое-то условие) - логическое выражение. (Predicate <Car> predicate) - это только шаблон для метод тестов выше
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){//здесь объект проходит тест с помощью единственного метода predicate
                count++;
            }
        }
        //читаем массив и перекладываем результаты в новый массив
        Car[] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){//объект проходит тест
                res[j++] = cars[i];
            }
        }
        return res;
    }


}//end of class
