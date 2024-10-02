package classwork_04;
public class MathMethod {
    public static void main(String[] args) { //первым стартует, а остальные методы из него/после него стартуют

    //перевод долларов в евро
        double money = 500; //$
        double euro = exchangeDollarsToEuro(money); // к переменной exchangeDollarsToEuro нужно писать метод, после метода main
        System.out.println("Euro:" + euro);

    //кол-во съеденных калорий
        double weigth = 200; //вес в граммах
        double calorage =50; // кол-во калорий на 100 грамм
        double energy = calculateCalorie(weigth, calorage);
        System.out.println("Energy = " + energy);

    //расход топлива и стоимости на поездку
        double distance = 1000; // в км
        double price = 2; // в евро за литр
        double fuelConsumption100 = 5; //расход в литрах на 100 км.
        double fuel = calculateFuel(distance, price, fuelConsumption100); // fuel - топливо, расход на 100 км
        double price1 = calculatePrice (distance, price,fuelConsumption100);

        System.out.println("Общий расход топлива на : " + distance + " км. составляет " +fuel+ "литров");  // Вывод результатов
        System.out.println("Стоимость поездки, при цене 2 евро за литр, на " +distance+ " км. состовляет " +price1+ " евро.");

        }//end of main

    //перевод долларов в евро
    private static double exchangeDollarsToEuro(double money) {
        double rate = 0.9;
        return money * rate;
    }//end of exchangeDollarsToEuro

    //кол-во съеденных калорий
    private static double calculateCalorie (double weight, double calorage) {
        return weight * calorage / 100;
    }//end of calculateCalorie

    //расход топлива и стоимости на поездку
    private static double calculateFuel (double distance, double price, double fuelConsumption100){
        return distance/100*fuelConsumption100;
    }
    private static double calculatePrice (double distance, double price, double fuelConsumption100) {
        return price*(distance/100*fuelConsumption100);
    }

}
