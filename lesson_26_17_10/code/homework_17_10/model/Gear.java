package homework_17_10.model;

public class Gear extends Detail{//Gear - шестеренка

    private double radius;
    private int tooth;

    public Gear(long barCode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;//зубья
    }

    @Override
    public double calcPrice() {
        return 0;
    }

}
