package homework_31_1_11.planets;

import java.util.Objects;

//Задача 2. Занести планеты солнечной системы в список, содержащий:
        //наименование;
        //расстояние до Солнца;
        //массу;
        //количество спутников.
//Вывести список планет отсортированный по:
        //порядку расположения в солнечной системе;
        //алфавиту;
        //массе;
        //количеству спутников.
public class Planets implements Comparable <Planets> {

    private String name;
    private double distanceToSun;// в млн км
    private double mass;// в килограммах, значение в long даже в тоннах не влазит
    private int numberOfSatellites;

    public Planets(String name, double distanceToSun, double mass, int numberOfSatellites) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planets)) return false;
        return Double.compare(distanceToSun, planets.distanceToSun) == 0 && Double.compare(mass, planets.mass) == 0 && numberOfSatellites == planets.numberOfSatellites && Objects.equals(name, planets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToSun, mass, numberOfSatellites);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToSun=").append(distanceToSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfSatellites=").append(numberOfSatellites);
        sb.append('}');
        return sb.toString();
    }

    //сортировка по умолчанию
    @Override
    public int compareTo(Planets o) {
        return Double.compare(this.getDistanceToSun(), o.getDistanceToSun());
    }

}
