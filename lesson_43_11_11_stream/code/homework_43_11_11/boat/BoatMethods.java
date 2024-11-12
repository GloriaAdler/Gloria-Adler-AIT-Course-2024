package homework_43_11_11.boat;
//Нужно создать набор яхт и выполнить следующие задачи:
//отобразить все яхты;+
//отобразить яхты, сделанные из указанного материала корпуса;+
//отобразить яхты дороже указанной цены;+
//отобразить яхты, чей год выпуска находится в заданном диапазоне;+
//отсортировать яхты в порядке убывания стоимости;+
//получить среднюю стоимость яхты из созданного набора;+
//сколько и конкретно какие яхты под каким флагом стоят в порту.+
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BoatMethods {

    private List <Boat> boats;

    public BoatMethods (List <Boat> boats){
        this.boats = new ArrayList<>(boats);
    }

    //отобразить все яхты;
    public void displayAllBoats (){
        boats.forEach(System.out::println);
    }

    //отобразить яхты, сделанные из указанного материала корпуса;
    public void displayBoatsByHullMaterial (String material){
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);
    }

    //отобразить яхты дороже указанной цены;
    public void displayBoatsByPrice (double price){
        boats.stream()
                .filter(boat -> boat.getPrice() > price)
                .forEach(System.out::println);
    }

    //отобразить яхты, чей год выпуска находится в заданном диапазоне;
    public void displayBoatsByRangeYear (int startYear, int endYear){
        boats.stream()
                .filter(boat -> boat.getYear() >= startYear && boat.getYear()<=endYear)
                .forEach(System.out::println);
    }

    //отсортировать яхты в порядке убывания стоимости;
    public void displayBoatsByDescendingPrice (){
        boats.sort(Comparator.comparingDouble(Boat::getPrice).reversed());//reversed - перевернет стандартную сортировку от меньшего к большему, т.е. будет от больщего в меньшему.
        displayAllBoats();
    }

    //получить среднюю стоимость яхты из созданного набора;
    public double displayBoatsByAveragePrice (){
        return boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0);
    }

    //сколько и конкретно какие яхты под каким флагом стоят в порту.
    public void displayBoatsByCountry (String country){
        List <Boat> filterBoats = boats.stream()
                .filter(boat -> boat.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
        System.out.println("Number of boats under the flag " + country + ": " + filterBoats.size());
        filterBoats.forEach(System.out::println);
    }




}
