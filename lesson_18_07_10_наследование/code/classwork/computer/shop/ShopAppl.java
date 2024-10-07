package classwork.computer.shop;
//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?
import classwork.computer.shop.model.Computer;
import classwork.computer.shop.model.Laptop;
import classwork.computer.shop.model.Smartphone;

public class ShopAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("m2", 16, 256, "Apple AirBook", 2200, 14, 1.5, 10, "black");
        System.out.println(laptop);

        Smartphone smartphone = new Smartphone("iOS18", 4, 128, "Apple iPhone11", 400, 6.1, 0.194, 24, "black", (long) 35657010220000.1);
        System.out.println(smartphone);

        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 2000);
        computers[3] = new Laptop ("Apple", 8, 256, "Apple AirBook", 2000, 14, 1.5, 10, "black");
        computers[4] = new Laptop("AMD7", 16, 512, "Asus", 2000, 15, 1.3, 115, "grey");
        computers[5] = new Smartphone("iOS18", 4, 128, "Apple iPhone11", 400, 6.1, 0.194, 24, "black", (long) 35657010220000.1);

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd(); //getSsd() - гетер из конструктора
        }

        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
          totalPrice += computers[i].getPrice();
        }

        System.out.println("Total prise: " + totalPrice);

        System.out.println("===========================================================================");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

        System.out.println("====================================================");

        for (int i = 0; i < computers.length; i++) {
            System.out.print(computers[i].getBrand() + " ");
        }
    }


}
