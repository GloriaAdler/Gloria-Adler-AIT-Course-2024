package homework_18_10.product.model;
// На примере класса Car с полями модель, цвет, стоимость, год выпуска повторить все то, что делали с классом Wine на занятии. Получить сортированные списки объектов типа Car:
     //по моделям
     //по цвету
     //по стоимости
     //по году выпуска. Реализовать в отдельно пакете car_sorting по аналогии (Car, CarTest)
import java.util.Objects;

public class Car implements Comparable <Car> {

     private String regNumber;
    private String brand;
     private String model;
     private String company;
     private double engine; // engine - двигатель
     private String color;
     private int age;
     private double price;

    public Car(String regNumber, String brand, String model, String company, double engine, String color, int age, double price) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.age = age;
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append(", age=").append(age);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(engine, car.engine) == 0 && age == car.age && Double.compare(price, car.price) == 0 && Objects.equals(regNumber, car.regNumber) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(company, car.company) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, brand, model, company, engine, color, age, price);
    }

    @Override
    public int compareTo(Car car) {
        return this.getAge() - car.age;
    }

}//end of class
