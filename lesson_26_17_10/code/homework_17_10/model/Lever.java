package homework_17_10.model;

public class Lever extends Detail {//Рычаг

   private double power;

    public Lever(long barCode, double size, String material, String vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }

    @Override
    public double calcPrice() {
        return 0;
    }
}
