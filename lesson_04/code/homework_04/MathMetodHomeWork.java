package homework_04;
//Напишите методы для конвертации валюты:
//евро в доллары США
//евро в британские фунты
//евро в китайские юани и проверьте их работу, вызвав их в main.

//Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту. Формулу пересчета найти в Интернете. Вызовите метод в main.
//Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.

public class MathMetodHomeWork {

    public static void main(String[] args) {

        double money = 300;//Euro
    //----------------------------------------------

        //евро в доллары США
        double dollar = exchangeEuroToDollars(money);
        System.out.println("Dollars:" + dollar);

        //евро в британские фунты
        double pounds = exchangeEuroToPounds(money);
        System.out.println("Pounds:" + pounds);

        //евро в китайские юани
        double chinaseYuan = exchangeEuroToChinaseYuan(money);
        System.out.println("Chinase Yuan:" + chinaseYuan);

    //======================================================
        //градусы Цельсия в градусы по Фаренгейту
        double celsius = 10;
        double fahrenheit = convertFromCelsiusToFahrenheit(celsius);
        System.out.println("При температуре в "+celsius+ " градусов по Цельсию, температура по Фаренгейту будет " +fahrenheit+ ".");

    //======================================================
        //морские мили в километры. 1 морская миля = 1852 метра.
        double miles =100;
        double kilometrs = convertFromMilesToKilometrs(miles);
        System.out.println("В " +miles+ " морских милях " +kilometrs+ " км.");
        System.out.printf("км %.2f", kilometrs); //шаблон для округления 2 - кол-во знаков, f - разделитель в десятичной дроби в виде запятой// после данной строки можно ввести println, тогда строчка будет продолжена, но следующее println даст новую строку


    }//end of main

    //евро в доллары США
    private static double exchangeEuroToDollars(double money) {
            double rate = 1.1; //rate-размер, норма, коэффициент
            return money * rate;
    }//end of exchangeEuroToDollars

    //евро в британские фунты
    private static double exchangeEuroToPounds(double money) {
        double rate = 0.8445; //rate-размер, норма, коэффициент
        return money * rate;
    }//end of exchangeEuroToPounds

    //евро в китайские юани
    private static double exchangeEuroToChinaseYuan(double money) {
        double rate = 7.86; //rate-размер, норма, коэффициент
        return money * rate;
    }//end of exchangeEuroToChinaseYuan

    //градусы Цельсия в градусы по Фаренгейту
    private static double convertFromCelsiusToFahrenheit (double celsium){
        double rate = 33.8;
        return celsium*rate;

    }//end of convertFromCelsiusToFahrenheit

    //морские мили в километры.
    private static double convertFromMilesToKilometrs (double miles){
        double rate = 1.852;
        return miles*rate;
    }//end of convertFromMilesToKilometrs

}//end of class
