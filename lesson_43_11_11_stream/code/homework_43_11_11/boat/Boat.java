package homework_43_11_11.boat;
import java.util.Objects;
//Задание 3. Создать класс «Яхта» (Boat). В классе должна храниться следующая информация:
//
//производитель(верфь);+
//страна (флаг);+
//год выпуска;+
//длина;+
//материал корпуса (дерево, пластик, металл);+
//стоимость.+
//Нужно создать набор яхт и выполнить следующие задачи:
//отобразить все яхты;
//отобразить яхты, сделанные из указанного материала корпуса;
//отобразить яхты дороже указанной цены;
//отобразить яхты, чей год выпуска находится в заданном диапазоне;
//отсортировать яхты в порядке убывания стоимости;
//получить среднюю стоимость яхты из созданного набора;
//сколько и конкретно какие яхты под каким флагом стоят в порту.
public class Boat {

    private String shipyard;
    private String country;
    private int year;
    private double length;
    private String hullMaterial;
    private double price;

    public Boat(String shipyard, String country, int year, double length, String hullMaterial, double price) {
        this.shipyard = shipyard;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getShipyard() {
        return shipyard;
    }

    public void setShipyard(String shipyard) {
        this.shipyard = shipyard;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat boat)) return false;
        return year == boat.year && Double.compare(length, boat.length) == 0 && Double.compare(price, boat.price) == 0 && Objects.equals(shipyard, boat.shipyard) && Objects.equals(country, boat.country) && Objects.equals(hullMaterial, boat.hullMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipyard, country, year, length, hullMaterial, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("shipyard='").append(shipyard).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", year=").append(year);
        sb.append(", length=").append(length);
        sb.append(", hullMaterial='").append(hullMaterial).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
