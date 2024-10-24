package classwork_24_10.cities;
//Создать класс City - название, население.
//Сделать класс City сортируемым по полю кол-во населения.
import java.util.Objects;

public class City implements Comparable <City> {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {//лишнее удалили, а ретурн отредокторовали, для красивого отображения
        return String.format("City name: %s, populetion: %d.", name, population);//строка, %d - цифра
    }

    //делаем класс сортируемым по "умолчанию", какой это будет критерий, выбираем самостоятельно, в этой задаче - по населению
    @Override
    public int compareTo(City o) {
        //return this.getPopulation() - o.getPopulation(); // 1й способ, стандартный, когда типы совпадают public *int* compareTo и private *int* population
        return Integer.compare (this.getPopulation(), o.getPopulation()); // 2й способ, через обертку Integer, чтобы наверняка метод сработал, если разные типы, то подбираем нужную обертку
        //return this.getName().compareTo(o.getName()); // sorting by alphabet

    }



}
