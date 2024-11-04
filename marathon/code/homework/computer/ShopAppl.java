package homework.computer;
//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?
//Найти общий вес всех мобильных устройств в ComputerShop.

import homework.computer.dau.ComputerImpl;
import homework.computer.dau.Shop;
import homework.computer.model.Computer;
import homework.computer.model.Laptop;
import homework.computer.model.Smartphone;

import java.util.List;
import java.util.Spliterator;

public class ShopAppl {

    public static void main(String[] args) {
        Shop computerActions = new ComputerImpl();

        Computer laptop = new Laptop("Intel i7", 16, 512, "Dell", 1200.99, 15.6, 2.5, 10, "Silver");
        Computer smartphone = new Smartphone("Snapdragon 888", 8, 128, "Samsung", 899.99, 6.5, 0.2, 24, "Black", 123456789012345L);

//        computerActions.add(laptop);
//        computerActions.addComputer(smartphone);
//
//        // Display all computers sorted by RAM
//        List<Computer> computers = computerActions.getAllComputers();
//        computers.sort(Computer::compareTo); // Using compareTo for sorting by RAM
//        System.out.println("Computers sorted by RAM:");
//        computers.forEach(System.out::println);
//
//        // Find computer by brand
//        String brandToFind = "Dell";
//        Computer foundComputer = computerActions.findComputerByBrand(brandToFind);
//        if (foundComputer != null) {
//            System.out.println("Found computer: " + foundComputer);
//        } else {
//            System.out.println("Computer with brand " + brandToFind + " not found.");
//        }
    }

}
