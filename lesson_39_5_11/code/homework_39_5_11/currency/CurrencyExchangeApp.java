package homework_39_5_11.currency;
//Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.
import java.util.Scanner;

public class CurrencyExchangeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //список доступных валют
        System.out.println("Select a currency to exchange to (enter the number):");
        System.out.println("1: 1 USD = " + Currency.USD.getRateToEuro() + " €");
        System.out.println("2: 1 RUB = " + Currency.RUB.getRateToEuro() + " €");
        System.out.println("3: 1 JPY = " + Currency.JPY.getRateToEuro() + " €");
        System.out.println("4: 1 CNY = " + Currency.CNY.getRateToEuro() + " €");
        System.out.println("5: 1 PLN = " + Currency.PLN.getRateToEuro() + " €");
        System.out.println("6: 1 CHF = " + Currency.CHF.getRateToEuro() + " €");

        System.out.print("Input your choice: ");//выбор пользователя
        int choice = scanner.nextInt();

        Currency selectedCurrency; //selected - выбранный
        switch (choice) {
            case 1 -> selectedCurrency = Currency.USD;
            case 2 -> selectedCurrency = Currency.RUB;
            case 3 -> selectedCurrency = Currency.JPY;
            case 4 -> selectedCurrency = Currency.CNY;
            case 5 -> selectedCurrency = Currency.PLN;
            case 6 -> selectedCurrency = Currency.CHF;
            default -> {
                System.out.println("Error. Invalid choice. ");
                return;
            }
        }

        // ввод суммы в евро для обмена
        System.out.print("Input sum to exchange: ");
        double sumInCurrency = scanner.nextDouble();

        // сколько всего в евро будет получено
        double sumInSelectedCurrency = sumInCurrency * selectedCurrency.getRateToEuro();
        System.out.printf("You will receive %.2f €", sumInSelectedCurrency);
    }
}
