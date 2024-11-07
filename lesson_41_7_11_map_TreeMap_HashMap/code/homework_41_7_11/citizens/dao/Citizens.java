package homework_41_7_11.citizens.dao;

import homework_41_7_11.citizens.model.Person;

public interface Citizens {//в интерфейсе определяем методы для работы с коллекцией объектов Person

    boolean add(Person person);//метод добавляет объект Person в коллекцию. Возвращает true, если добавлен успешно, и false, если объект не был добавлен (например, если такой Person уже есть в коллекции).

    boolean remove(int id);//метод удаляет объект Person из коллекции по его id. Возвращает true, если удаление прошло успешно, и false, если Person с таким id не найден.

    Person find(int id);//метод ищет и возвращает объект Person с указанным id. Если объект с таким id не найден, метод возвращает null.

    Iterable<Person> find(int minAge, int maxAge);//Метод возвращает всех Person, возраст которых находится в заданном диапазоне minAge и maxAge (включительно). Возвращаемый тип Iterable<Person> позволяет удобно обходить результат.

    Iterable<Person> find(String lastName);//Метод возвращает всех Person с указанной фамилией lastName

    Iterable<Person> getAllPersonSortedById();//Метод возвращает всех Person из коллекции, отсортированных по id

    Iterable<Person> getAllPersonSortedByLastName();//Метод возвращает всех Person в коллекции, отсортированных по фамилии (lastName).

    Iterable<Person> getAllPersonSortedByAge();//Метод возвращает всех Person, отсортированных по возрасту.

    int size();//Метод возвращает количество объектов Person в коллекции
}
