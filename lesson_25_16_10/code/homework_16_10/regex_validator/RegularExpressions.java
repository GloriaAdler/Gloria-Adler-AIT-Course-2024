package homework_16_10.regex_validator;
//Создайте регулярные выражения для следующих проверок:
//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
//И проверьте их с помощью тестов в пакете regex_validator
public class RegularExpressions {
    public static void main(String[] args) {

        // Проверка кредитной карты (8-16 digits)
        RegexValidator creditCartNumber = new RegexValidator("^\\d{8,16}$");
        System.out.println("Credit card number: " + creditCartNumber.isValid("1234567891011121"));

        // Проверка даты (DD.MM.YYYY)
        RegexValidator dateEU = new RegexValidator("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        System.out.println("Date Valid (DD.MM.YYYY): " + dateEU.isValid("40.13.2024"));

        // Проверка даты (YYYY-MM-DD)
        RegexValidator dateUSA = new RegexValidator("^\\d{4}-\\d{2}-\\d{2}$");
        System.out.println("Date Valid (YYYY-MM-DD): " + dateUSA.isValid("2024-10-16"));

        // Проверка номера телефона (+99(99)9999-9999)
        RegexValidator phoneNumber = new RegexValidator("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$");
        System.out.println("Phone Number Valid: " + phoneNumber.isValid("12(34)5678-9000"));

        // Проверка числа, меньше или равного 255
        RegexValidator number = new RegexValidator("^([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        System.out.println("Number <= 255 Valid: " + number.isValid("255"));

    }


}
