package homework_31_1_11.computer;
import java.util.Objects;
//Задача 1. На основе класса Computer:
        //создать собственный ArrayList;
        //добавить в него не менее 6 элементов;
        //отсортировать список по *бренду*;
        //отсортировать список по размеру *RAM*, затем размеру *SSD* при равенстве RAM;
        //подсчитать общий суммарный объем и среднее значение SSD.
public class Computer implements Comparable <Computer>{

    private int ram; // RAM (Random Access Memory), или оперативная память. 8, 16, 32, 64. тип энергозависимой памяти ПК, используемой для временного хранения данных, необходимых процессору для выполнения текущих задач, данные в RAM хранятся только во время работы ПК и стираются при его выключении.
    private int ssd;//жесткий диск: 128, 256, 512, 1T, 2T usw
    private String brand;

    //конструктор
    public Computer(int ram, int ssd, String brand) {
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    //геттеры и сеттеры
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, ssd, brand);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //сортировка по умолчанию
    @Override
    public int compareTo(Computer o) {
        return Integer.compare(this.getRam(),o.getRam());//Integer.compare - сортировка от меньшего к большему
    }
}
