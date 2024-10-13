package homework11_10.address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AddressTest {

    Address address;//тестируемый класс

    final String city = "Berlin";
    final String postalСode = "10178";

    @BeforeEach//заводим @BeforeEach, чтобы избежать повторения кода в каждом тесте
    void setUp() {
        address = new Address("Berlin", "10178");
    }

    @Test
    public void testIsCityValidUpperCase() {//город с большой буквы. Проверяем, что метод возвращает true, если город начинается с заглавной буквы. Все остальные методы testIsCity... возвращают false.
        address.setCity("Berlin");
        assertEquals("Berlin", address.getCity());
    }

    @Test
    public void testIsCityValidNotUpperCase() {//город с маленькой буквы
    address.setCity("berlin");
    assertEquals("Berlin", address.getCity());
    }

    @Test
    public void testIsCityValidEmptyCity() {// Пустой город или пробел
        address.setCity(" ");
        assertEquals("Berlin", address.getCity());
    }

    @Test
    public void testIsCityValidNullCity() {//город не заполнен, (null)
        address.setCity(null);
        assertEquals("Berlin", address.getCity());
    }

    @Test
    public void testIsPostalCodeValidCorrectFormat() {//корректный почтовый индекс. Проверяем, что метод возвращает true, если индекс содержит ровно 5 целых чисел цифр. Все остальные методы testIsPostalCode... возвращают false.
        address.setPostalСode("10178");
        assertEquals("10178", address.getPostalСode());
    }

    @Test
    public void testIsPostalCodeValidIncorrectFormat() {//некорректный почтовый индекс
        address.setPostalСode("87101");
        assertEquals("10178", address.getPostalСode());
    }

    @Test
    public void testIsPostalCodeValid_IncorrectFormatTooFewDigits() {//некорректный почтовый индекс мало цифр
        address.setPostalСode("1017");
        assertEquals("10178", address.getPostalСode());
    }

    @Test
    public void testIsPostalCodeValid_IncorrectFormatTooManyDigits() {//некорректный почтовый индекс много цифр
        address.setPostalСode("1017800");
        assertEquals("10178", address.getPostalСode());
    }

    @Test
    public void testIsPostalCodeValid_ContainsLetters() {//буква в индексе
        address.setPostalСode("10178a");
        assertEquals("10178", address.getPostalСode());
    }

    @Test
    public void testIsPostalCodeValid_NullPostalCode() {//пустой индекс null
        address.setPostalСode(null);
        assertEquals("10178", address.getPostalСode());
    }

}