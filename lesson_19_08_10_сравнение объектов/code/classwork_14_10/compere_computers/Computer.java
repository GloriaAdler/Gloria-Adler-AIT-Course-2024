package classwork_14_10.compere_computers;

import java.util.Objects;

public class Computer {

    private String cpu;
    private int ram; // 8, 16, 32
    private int ssd;//память
    private String brand;
    private double price;

    public Computer(String cpu, int ram, int ssd, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {//делаем это для того, чтобы рабочий класс мог делать сравнение без учета ссылок
        if (this == o) return true;//сравниваем объект сам с собой, только значение без ссылок
        if (!(o instanceof Computer computer)) return false;//если наш объект не является объектом нашего класса, тогда будет фальшь
        return ram == computer.ram && ssd == computer.ssd && Double.compare(price, computer.price) == 0 && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);//Double. - это класс-обёртка (Double с большой буквы указывает на это)
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, price);
    }


}
