package homework_43_11_11.boat;
//Задание 3. Создать класс «Яхта» (Boat). В классе должна храниться следующая информация:
//
//производитель(верфь);+
//страна (флаг);+
//год выпуска;+
//длина;+
//материал корпуса (дерево, пластик, металл);+
//стоимость.+

//Нужно создать набор яхт и выполнить следующие задачи:
//отобразить все яхты;+
//отобразить яхты, сделанные из указанного материала корпуса;+
//отобразить яхты дороже указанной цены;+
//отобразить яхты, чей год выпуска находится в заданном диапазоне;+
//отсортировать яхты в порядке убывания стоимости;+
//получить среднюю стоимость яхты из созданного набора;+
//сколько и конкретно какие яхты под каким флагом стоят в порту.+
import java.util.Arrays;
import java.util.List;

public class BoatAppl {
    public static void main(String[] args) {
        List<Boat> boats = Arrays.asList(
                new Boat("Boat 1", "Germany", 2029, 15, "Wood", 200_000),
                new Boat("Boat 2", "France", 2021, 20, "Metal", 250_000),
                new Boat("Boat 3", "Italy", 2022, 25, "Wood", 200_000),
                new Boat("Boat 4", "Germany", 2021, 25.5, "Metal", 270_000),
                new Boat("Boat 5", "France", 2024, 18.5, "Plastic", 300_000)
        );

        BoatMethods boatMethods = new BoatMethods(boats);

        System.out.println("All boats: ");
        boatMethods.displayAllBoats();
        System.out.println();

        System.out.println("made of plastic: ");
        boatMethods.displayBoatsByHullMaterial("Plastic");
        System.out.println();

        System.out.println("Boats are more expensive than 200,000: ");
        boatMethods.displayBoatsByPrice(200000);
        System.out.println();

        System.out.println("Boat, released from 2022 to 2024: ");
        boatMethods.displayBoatsByRangeYear(2022, 2024);
        System.out.println();

        System.out.println("Descending price: ");
        boatMethods.displayBoatsByDescendingPrice();
        System.out.println();

        System.out.println("Average price: " + boatMethods.displayBoatsByAveragePrice());
        System.out.println();

        System.out.println("Country is Germany: ");
        boatMethods.displayBoatsByCountry("Germany");
    }
}
