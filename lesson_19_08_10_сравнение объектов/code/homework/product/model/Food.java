package homework.product.model;

import java.util.Objects;

//Создать класс Food расширяющий класс Product с полем private String expDate (дата окончания срока действия), которое хранит дату истечения срока годности.
//Во всех классах переопределить метод toString.

// В Задаче 1 переопределить метод equals для сравнения объектов во всех классах.
public class Food extends Product {

    private String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }


    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }
}
