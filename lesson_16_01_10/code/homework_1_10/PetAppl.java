package homework_1_10;
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.

import homework_1_10.modelPet.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet myPet = new Pet(1, "Cat", 3, "Murka");
        System.out.println(myPet.display());

        myPet.sleep();
        myPet.eat();
        myPet.makeSound();
        myPet.play();
        myPet.walk();

    }
}
