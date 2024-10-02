package classwork_1_10.car_object;

import classwork_1_10.car_object.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "silver", false);//create object

        System.out.println(myCar.display()); //нам нужен sout, потому что в классе Car метод display ничего не печатает!!! Он только формирует строку!!! А если бы метод печатал, то было бы myCar.display();

        myCar.move();
        myCar.stop();


    }
}
