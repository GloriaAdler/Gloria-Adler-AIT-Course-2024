package homework_41_7_11.citizens.test;

import homework_41_7_11.citizens.dao.Citizens;
import homework_41_7_11.citizens.dao.CitizensImpl;
import homework_41_7_11.citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CitizensTest {
    Citizens citizens;//переменная citizens хранит объект Citizens, который инициализируется перед каждым тестом в методе setUp.
    static final LocalDate now = LocalDate.now();//статическая константа, которая фиксирует текущую дату (LocalDate.now()). Она используется для расчета возраста тестовых объектов Person.


    @BeforeEach
    void setUp() {
        citizens = new CitizensImpl(// объект CitizensImpl с четырьмя объектами Person
                List.of(new Person(1, "Peter", "Jackson", now.minusYears(23)),
                        new Person(2, "John", "Smith", now.minusYears(20)),
                        new Person(3, "Mary", "Jackson", now.minusYears(20)),
                        new Person(4, "Rabindranate", "Anand", now.minusYears(25)))
        );

    }

    @Test//проверяем, что при создании коллекции CitizensImpl с двумя идентичными объектами Person, добавляется только один. Поскольку объекты Person имеют одинаковый id, дублирование должно быть предотвращено. Ожидается, что размер коллекции будет 1.
    void testCitizensImplListOfPerson() {
        citizens = new CitizensImpl(List.of(new Person(1, "Peter", "Jackson", now.minusYears(23))
                , new Person(1, "Peter", "Jackson", now.minusYears(23))));
        assertEquals(1, citizens.size());
    }

    @Test//проверяем метод add, чтобы убедиться, что: null не добавляется; дубликаты по id не добавляются; новые объекты добавляются корректно.
    void add() {
        assertFalse(citizens.add(null)); // не добавляем null
        assertFalse(citizens.add(new Person(2, "John", "Smith", now.minusYears(20)))); // не добавляем дубликат
        assertEquals(4, citizens.size()); // проверяем, что добавили 4 элемента
        assertTrue(citizens.add(new Person(5, "John", "Smith", now.minusYears(20)))); // добавляем новый элемент, он должен добавится
        assertEquals(5, citizens.size()); // проверяем, что добавили 5-й элемент
    }

    @Test//проверяем метод remove на корректное удаление, если id не найден, возвращается false, если id найден, объект удаляется, и размер коллекции уменьшается.
    void remove() {
        assertFalse(citizens.remove(5));
        assertEquals(4, citizens.size());
        assertTrue(citizens.remove(2));
        assertEquals(3, citizens.size());
    }

    @Test//проверяем, что метод find корректно возвращает объект Person по id, если он существует, и null, если не найден.
    void findById() {
        Person person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23, person.getAge());
        assertNull(citizens.find(5));
    }

    @Test//проверяем метод find на корректное получение списка людей в заданном возрастном диапазоне.
    void testFindByAges() {
        Iterable<Person> res = citizens.find(20, 23);
//        for (Person person : res) {
//            assertTrue(person.getAge() >= 20 && person.getAge() <= 23);
//        }
        res.forEach(p -> assertTrue(p.getAge() >= 20 && p.getAge() <= 23));
    }

    @Test//проверяем метод find на корректное возвращение списка людей с указанной фамилией. Сначала создается actual — отфильтрованный и отсортированный список людей с фамилией Jackson, затем сравнивается с expected.
    void testFindByLastName() {
        Iterable<Person> res = citizens.find("Jackson");
//        res.forEach(p -> assertTrue("Jackson".equals(p.getLastName())));
        List<Person> actual = new ArrayList<>();
        res.forEach(p -> actual.add(p));
        Collections.sort(actual);
        Iterable<Person> expected = List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(3, "Mary", "Jackson", now.minusYears(20)));
        assertIterableEquals(expected, actual);
    }

    @Test//проверяем, что метод getAllPersonSortedById возвращает список, отсортированный по id.
    void getAllPersonSortedById() {
        Iterable<Person> actual = citizens.getAllPersonSortedById();
        Iterable<Person> expected = List.of(new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Mary", "Jackson", now.minusYears(20)),
                new Person(4, "Rabindranate", "Anand", now.minusYears(25)));
        assertIterableEquals(expected, actual);
    }

    @Test//проверяем, что getAllPersonSortedByLastName возвращает список, отсортированный по фамилиям.
    void getAllPersonSortedByLastName() {
        Iterable<Person> actual = citizens.getAllPersonSortedByLastName();
        String name = "";
        int count = 0;
        for (Person person : actual) {
            count++;
            assertTrue(person.getLastName().compareTo(name) >= 0);
            name = person.getLastName();
        }
        assertEquals(4, count);
    }

    @Test//проверяем, что getAllPersonSortedByAge возвращает список, отсортированный по возрасту.
    void getAllPersonSortedByAge() {
        Iterable<Person> res = citizens.getAllPersonSortedByAge();
        int age = -1;
        int count = 0;
        for (Person person : res) {
            count++;
            assertTrue(person.getAge() >= age);
            age = person.getAge();
        }
        assertEquals(4, count);
    }

    @Test//проверяем, что метод size возвращает корректное количество элементов в коллекции.
    void size() {
        assertEquals(4, citizens.size());
    }
}
