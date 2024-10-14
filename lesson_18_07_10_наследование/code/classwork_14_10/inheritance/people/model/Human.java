package classwork_14_10.inheritance.people.model;

public class Human {

    boolean gender;// здесь нет модификатора private, используется defaulf modifier - модификатор, как раз потому что нет модификатора private или public
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;

    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
