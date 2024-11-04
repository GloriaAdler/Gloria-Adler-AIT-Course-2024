package homework.computer.model;

import java.util.Objects;

public class Smartphone extends Laptop {

    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }
    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        if (!super.equals(o)) return false;
        return imei == that.imei;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), imei);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartphone{");
        sb.append("imei=").append(imei);
        sb.append('}');
        return sb.toString();
    }
}
