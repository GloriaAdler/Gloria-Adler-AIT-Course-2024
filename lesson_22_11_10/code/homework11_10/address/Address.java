package homework11_10.address;

import java.util.Objects;

//Задача 3.(*) Создать класс Address, проверить:
//             - город с большой буквы
//             - индекс содержит 5 цифр
//             - предложите еще тесты
public class Address {

    private String city;//город с большой буквы, название состоит только из букв
    private String postalСode;//индекс содержит 5 цифр, индекс не содержит цифр

    public Address(String city, String postalСode) {
        this.city = city;
        this.postalСode = postalСode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalСode() {
        return postalСode;
    }
    public void setPostalСode(String postalСode) {
        this.postalСode = postalСode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(city, address.city) && Objects.equals(postalСode, address.postalСode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, postalСode);
    }

    // Метод для проверки, что название города начинается с заглавной буквы
    public boolean isCityValid() {
        return city != null && !city.isEmpty() && Character.isUpperCase(city.charAt(0));// проверяем, что (!= null) поле city не пустое и (isUpperCase) - начинается с заглавной буквы
    }

    // Метод для проверки, что индекс содержит ровно 5 цифр
    public boolean isPostalCodeValid() {
        return postalСode != null && postalСode.matches("\\d{5}"); // проверяем, что (!= null) поле postalСode не пустое и состоит ровно из 5 цифр - (\d{5}, где d - целые числа, а 5 их кол-во)!
    }
}
