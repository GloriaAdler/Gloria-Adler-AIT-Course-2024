package homework.pet;
//Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
import homework.pet.model.Cat;
import homework.pet.model.Dog;
import homework.pet.model.Pet;

public class HouseAppl {
    public static void main(String[] args) {//заводим 2х собак и 3х кошек
        Dog dog1 = new Dog("dog001", "dog", 5, "Nik", "doberman", 80,40);
        System.out.println(dog1);
        Dog dog2 = new Dog("dog002", "dog", 3, "Dok", "chihuahua", 12.5,2.5);
        System.out.println(dog2);
        Cat cat1 = new Cat("cat001", "cat", 2, "Busy", "Sphinx", 20, 6);
        System.out.println(cat1);
        Cat cat2 = new Cat("cat002", "cat", 7, "Pika", "Sphinx", 25, 6.5);
        System.out.println(cat2);
        Cat cat3= new Cat("cat003", "cat", 4, "Dori", "Sphinx", 22, 5);
        System.out.println(cat3);

        System.out.println("==============================================================================");

        Pet[] pets = {dog1, dog2, cat1, cat2, cat3};// Массив питомцев в доме
        System.out.println("Life in this house.");//жизнь в доме в течение дня

        for (Pet pet : pets) {
            pet.voice();  // Каждый питомец издает звук
        }
    }
}
