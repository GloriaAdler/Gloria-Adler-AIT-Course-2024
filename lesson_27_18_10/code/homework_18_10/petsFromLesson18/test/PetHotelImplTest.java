package homework_18_10.petsFromLesson18.test;

import homework_18_10.petsFromLesson18.dau.PetHotelImpl;
import homework_18_10.petsFromLesson18.model.Cat;
import homework_18_10.petsFromLesson18.model.Dog;
import homework_18_10.petsFromLesson18.model.Pets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetHotelImplTest {

    private PetHotelImpl hotel;
    private Cat cat1;
    private Cat cat2;
    private Dog dog;

    @BeforeEach
    void setUp() {
        // Инициализация отеля и животных перед каждым тестом
        hotel = new PetHotelImpl(3, 3); // отель на 3 животных и 3 дня
        cat1 = new Cat(101, "cat", 1, "name1", "Siamese");
        cat2 = new Cat(102, "cat", 2, "name2","Persian");
        dog = new Dog(103, "dog", 3, "name3","Labrador");

        // Добавляем животных в отель
        hotel.addPet(cat1);
        hotel.addPet(cat2);
        hotel.addPet(dog);
    }

    @Test
    void addPetTest() {
        // Пытаемся добавить ещё одно животное, хотя вместимость отеля уже достигнута
        Dog newDog = new Dog(104, "dog", 3, "name4","Labrador");
        hotel.addPet(newDog); // отель уже заполнен

        double totalEarnings = hotel.calculateTotalEarnings();
        assertEquals(105.0, totalEarnings, 0.001); // новое животное не добавилось, так что сумма не изменилась
    }

    @Test
    void findPetByIdTest() {//поиск по номеру
        Pets foundPet = hotel.findPetById(101);
        assertNotNull(foundPet); // должен найтись питомец с ID 101
        assertEquals("name1", foundPet.getName());

        // Проверяем на несуществующий ID
        Pets notFoundPet = hotel.findPetById(99);
        assertNull(notFoundPet); // питомец с ID 99 не должен существовать
    }

    @Test
    void findPetsByTypeTest() {//поиск по типу
        Pets[] cats = hotel.findPetsByType("Cat");
        assertEquals(2, cats.length); // должно быть найдено 2 кота

        Pets[] dogs = hotel.findPetsByType("Dog");
        assertEquals(1, dogs.length); // должна быть найдена 1 собака
    }

    @Test
    void calculateTotalEarningsTest() {//проверяем корректность расчетов
        double totalEarnings = hotel.calculateTotalEarnings();
        assertEquals(105.0, totalEarnings, 0.001); // (10*3)- за первую кошку + (10*3)-за вторую кошку + (15*3)- за собаку = 105
    }
}