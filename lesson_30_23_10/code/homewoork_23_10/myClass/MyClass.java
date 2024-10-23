package homewoork_23_10.myClass;

import java.util.Objects;

//Задание 1. Придумайте класс МойКласс с полями типа:
       //String
       //int
       //double
//например: Person - name, weight, age City - name, population, area ... или выберите тот, с которым вы делали проекты по Марафону.
//Выполните с набором объектов этого класса все то, что мы делали на занятии:
       //сортировка по умолчанию
       //сортировка по 2-м критериям
       //поиск в массиве с помощью Arrays.binarySearch()
public class MyClass implements Comparable <MyClass>{

    private String name;
    private int age;
    private long steuernummer;
    private double income; // доход

    public MyClass(String name, int age, long steuernummer, double income) {
        this.name = name;
        this.age = age;
        this.steuernummer = steuernummer;
        this.income = income;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSteuernummer() {
        return steuernummer;
    }
    public void setSteuernummer(long steuernummer) {
        this.steuernummer = steuernummer;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass myClass)) return false;
        return age == myClass.age && steuernummer == myClass.steuernummer && Double.compare(income, myClass.income) == 0 && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, steuernummer, income);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyClass{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", steuernummer=").append(steuernummer);
        sb.append(", income=").append(income);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(MyClass o) {
        return Integer.compare((int) this.getSteuernummer(), (int) o.getSteuernummer());//сделан кастинг
    }

}
