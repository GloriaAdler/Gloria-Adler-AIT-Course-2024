package homework_41_7_11.citizens.dao;

import homework_41_7_11.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl  implements Citizens {
    // статические переменные класса
    private static Comparator<Person> lastNameComparator;//lastNameComparator — компаратор для сортировки по фамилии. Если фамилии равны, используется сортировка по id.
    private static Comparator<Person> ageComparator;//ageComparator — компаратор для сортировки по возрасту. Если возраст одинаковый, используется id

    static {// инициируем компараторы для сравнения объектов Person по фамилии или возрасту с учетом id
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    //списки хранящие объекты Person:
    private List<Person> idList;//отсортированы по id.
    private List<Person> lastNameList;//отсортированы по lastName
    private List<Person> ageList;//отсортированы по age

    //конструктор инициирующие пустые списки
    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }
    //конструктор принимающий список Person и добавляющий каждого человека с помощью метода add.
    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // метод добавляет объект Person в коллекцию. Возвращает true, если добавлен успешно, и false, если объект не был добавлен (например, если такой Person уже есть в коллекции).
    @Override
    public boolean add(Person person) {
        //Если person равен null, возвращает false
        if (person == null) {
            return false;
        }
        int index = Collections.binarySearch(idList, person); // Используем Collections.binarySearch для поиска позиции в idList для добавления
        if (index >= 0) { //если person уже существует (index >= 0), возвращает false  (чтобы избежать дубликатов по id).
            return false;
        }
        index = -index - 1; //если результат отрицательный, преобразуем его в индекс для вставки: index = -index - 1 - формула позволяет получить индекс, где нужно вставить person для сохранения сортировки.
        idList.add(index, person); // person добавляется в idList на вычисленную позицию.
        // ищем места для вставки в ageList
        index = Collections.binarySearch(ageList, person, ageComparator);//добавляем person в ageList, который отсортирован по возрасту. Здесь используется ageComparator, чтобы binarySearch сравнивал объекты по возрасту, а не по умолчанию (который использует compareTo).
        index = index >= 0 ? index : - index - 1;//binarySearch вернет: положительный индекс index, если элемент с таким возрастом уже существует; отрицательный индекс, если элемент не найден и binarySearch указывает предполагаемую позицию для вставки.  Если index отрицателен, преобразуем его для вставки: index = -index - 1;.
        ageList.add(index, person);//person добавляется в ageList на правильное место, сохраняя сортировку по возрасту.
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);//добавляем person в lastNameList, отсортированный по фамилии.
        index = index >= 0 ? index : -index - 1;//аналогично age
        lastNameList.add(index, person);//добавляем person на вычисленное место, сохраняя сортировку по фамилии
        return true;//Если person успешно добавлен во все три списка, метод возвращает true.
    }

    // метод удаляет объект Person из коллекции по его id. Возвращает true, если удаление прошло успешно, и false, если Person с таким id не найден.
    @Override
    public boolean remove(int id) {
        Person victim = find(id);//находим Person по id.
        if (victim == null) {//если объект не найден, возвращает false.
            return false;
        }
        //удаляет Person из всех списков, если он существует
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // метод ищет и возвращает объект Person с указанным id. Если объект с таким id не найден, метод возвращает null.
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());//Создаем "паттерн" с указанным id.
        int index = Collections.binarySearch(idList, pattern);//Ищет id в idList.
        return index < 0 ? null : idList.get(index);// Если id не найден, возвращает null.
    }

    // //Метод возвращает всех Person, возраст которых находится в заданном диапазоне minAge и maxAge (включительно). Возвращаемый тип Iterable<Person> позволяет удобно обходить
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        //Находим всех Person в диапазоне возраста minAge и maxAge, создаем два паттерна — для minAge и maxAge. Определяем позиции начала и конца.
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);//возвращаем подсписок ageList между этими позициями.
    }

    //Метод возвращает всех Person с указанной фамилией lastName, метод работает аналогично предыдущему, но ищет всех Person с определенной lastName.
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    //Метод возвращает всех Person из коллекции, отсортированных по id
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    //Метод возвращает всех Person в коллекции, отсортированных по фамилии (lastName).
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    //Метод возвращает всех Person, отсортированных по возрасту.
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    //Метод возвращает количество объектов Person в коллекции
    @Override
    public int size() {
        return idList.size();
    }
}
