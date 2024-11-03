package homework_31_1_11.athletes;
//Задача 3.(*) Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах и десятых долях секунды. Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.
import java.util.Objects;

public class Athlete implements Comparable <Athlete>{

    private String lastName;
    private String firstName;
    private int registrationNumber;
    private String club;
    private double resultTime;

    public Athlete(String lastName, String firstName, int registrationNumber, String club, double resultTime) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultTime = resultTime;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public double getResultTime() {
        return resultTime;
    }
    public void setResultTime(double resultTime) {
        this.resultTime = resultTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete athlete)) return false;
        return registrationNumber == athlete.registrationNumber && Double.compare(resultTime, athlete.resultTime) == 0 && Objects.equals(lastName, athlete.lastName) && Objects.equals(firstName, athlete.firstName) && Objects.equals(club, athlete.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, registrationNumber, club, resultTime);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Athlete{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", club='").append(club).append('\'');
        sb.append(", resultTime=").append(resultTime);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Athlete o) {
        return Double.compare(this.getResultTime(), o.resultTime);
    }
}
