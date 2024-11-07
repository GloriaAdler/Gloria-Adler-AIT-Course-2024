package homework_41_7_11.citizens.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person implements Comparable<Person>{

    //заводим 4 поля: номер, ФИ и ДР
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    //конструктор на все поля
    public Person(int id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    //геттеры на все поля
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    //сеттеры на ФИ
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //метод для вычисления возраста. За основу берем дату рождения и текущую дату
    public int getAge() {
        LocalDate now = LocalDate.now();//содержит текущую дату
        return (int) ChronoUnit.YEARS.between(birthDate, now);//ChronoUnit.YEARS.between - вычесляет разницу в тек.дате и дате рождения, выводя разницу в кол-ве полных лет. (int) - используем для получения целых чисел.
    }

    //equals и hashCode создаем только для id (для сравнения объектов и обеспечения их правильной работы в коллекциях)
    @Override
    public final boolean equals(Object object) {//equals() проверяет, равны ли два объекта
        if (this == object) return true;//проверка на идентичность ссылок, т.е. ссылаются ли this и object на один и тот же объект. Если да, то объекты точно равны, и метод сразу возвращает true.
        if (!(object instanceof Person person)) return false;// проверка на то, что объект принадлежит классу Person. Если нет, метод сразу возвращает false. Также одновременно создается переменная person

        return id == person.id;//сравнение объектов по полю id: текущего объекта (this.id) и id переданного объекта (person.id). Если id одинаковый, метод возвращает true, иначе — false.
    }
    //Метод hashCode() возвращает числовое значение (хеш-код) для объекта, которое помогает в быстром поиске и хранении объекта в коллекциях, таких как HashSet, HashMap и других, использующих хеширование.
    @Override
    public int hashCode() {
        return id;//возвращает значение id
    }
    //Использование id для equals() и hashCode() методов означает, что два объекта Person с одинаковым id будут иметь одинаковый hashCode() и будут считаться равными.

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(getAge());
        sb.append('}');
        return sb.toString();
    }

    @Override
    //метод compareTo реализует интерфейс Comparable<Person> для класса Person. Он определяет порядок сравнения объектов Person, основанный на их id.Используется для сортировки по умолчанию (Collections.sort() - отсортирует id по возрастанию)
    public int compareTo(Person o) {//(Person o) - принимает один параметр o, который является другим объектом типа Person и с которым мы сравниваем текущий объект (this).
        return Integer.compare(id, o.id);//Integer.compare(id, o.id) делает сравнение значений id текущего объекта Person и объекта o.
    }

}
