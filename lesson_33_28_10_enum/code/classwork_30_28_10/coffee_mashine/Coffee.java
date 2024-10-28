package classwork_30_28_10.coffee_mashine;
//**Задача 3.**
//Используя enum, напишите программу для продажи 4-х видов кофе:
//ESPRESSO,
//AMERICANO,
//CAPPUCCINO,
//LATTE
//Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.
public enum Coffee {
    ESP ("ESPRESSO", 2.5, 1), AMR ("AMERICANO", 3.0 , 2), CAP ("CAPPUCCINO", 4.0, 3), LAT ("LATTE", 4.9, 4);

    //field
    private String title;
    private double price;
    private int choice;

    Coffee(String title, double price, int choice) {
        this.title = title;
        this.price = price;
        this.choice = choice;
    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }
}
