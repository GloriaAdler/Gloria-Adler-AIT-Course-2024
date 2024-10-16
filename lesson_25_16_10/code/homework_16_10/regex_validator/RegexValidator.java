package homework_16_10.regex_validator;

import java.util.regex.Pattern;

//Создайте регулярные выражения для следующих проверок:
//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
//И проверьте их с помощью тестов в пакете regex_validator
public class RegexValidator {

    private Pattern pattern;

    //конструктор
    public RegexValidator(String regex) {//String regex передаем строку, как регулярное выражение, которое будет использоваться для проверки данных
        this.pattern = Pattern.compile(regex);//compile - из библиотеки java, преобразует строку регулярного выражения regex в объект Pattern
    }

    public boolean isValid (String input){//проверяем, соответствует ли строка заданному регулярному выражению
        return pattern.matcher(input).matches();//matcher - проверяет строку input (выражению); .matches() - метод matches проверяет, соответствует ли вся строка input регулярному выражению pattern
    }

}
