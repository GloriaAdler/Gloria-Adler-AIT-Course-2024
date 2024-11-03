package homework_18_10.computer.model;

import java.util.Objects;

public class Laptop extends Computer {//extends - расширение родительского класса

    private double displaySize;
    private double weight;
    private int batteryLife;
    private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(displaySize, laptop.displaySize) == 0 && Double.compare(weight, laptop.weight) == 0 && batteryLife == laptop.batteryLife && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displaySize, weight, batteryLife, color);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("displaySize=").append(displaySize);
        sb.append(", weight=").append(weight);
        sb.append(", batteryLife=").append(batteryLife);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}