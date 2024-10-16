package homework_16_10.regex_validator;
//Создайте регулярные выражения для следующих проверок:
//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
//И проверьте их с помощью тестов в пакете regex_validator
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RegexValidatorTest {

    @Test
    public void testCreditCard() {
        RegexValidator creditCardNumber = new RegexValidator("^\\d{8,16}$");

        assertTrue(creditCardNumber.isValid("12345678"));//номер 8 цифр
        assertTrue(creditCardNumber.isValid("1234567891011121"));//номер 16 цифр
        assertFalse(creditCardNumber.isValid("1234"));//меньше 8 цифр
        assertFalse(creditCardNumber.isValid("12345678901234567"));//больше 16
        assertFalse(creditCardNumber.isValid("1234а5678"));//буква в номере
        assertFalse(creditCardNumber.isValid("1234_5678"));//символ в номере
    }

    @Test
    public void testDate_DDMMYYYY() {
        RegexValidator dateEU = new RegexValidator("^\\d{2}\\.\\d{2}\\.\\d{4}$");

        assertTrue(dateEU.isValid("17.10.2024"));//принимает любые значения, даже не существующие даты, главное чтобы дата и месяц содержали по 2 цифры, а год 4.
        assertFalse(dateEU.isValid("a0.a0.а000"));//буква в дате
        assertFalse(dateEU.isValid("17/10/2024"));//некорректные разделители в дате
        assertFalse(dateEU.isValid("17102024"));//нет разделителя совсем
        assertFalse(dateEU.isValid("2024.10.17"));//не верный порядок
    }

    @Test
    public void testDate_YYYYMMDD() {
        RegexValidator dateUSA = new RegexValidator("^\\d{4}-\\d{2}-\\d{2}$");

        assertTrue(dateUSA.isValid("2024-10-17"));//аналогично европейскому формату
        assertFalse(dateUSA.isValid("а000-а0-а0"));
        assertFalse(dateUSA.isValid("2024/10/17"));
        assertFalse(dateUSA.isValid("20241017"));
        assertFalse(dateUSA.isValid("17.10.2024"));
    }

    @Test
    public void testPhoneNumber() {
        RegexValidator phoneNumber = new RegexValidator("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$");

        assertTrue(phoneNumber.isValid("+12(34)5678-9000"));//верный формат
        assertFalse(phoneNumber.isValid("123456789000"));//не верный формат
        assertFalse(phoneNumber.isValid("+12-34-5678-9000"));//не те разделители
        assertFalse(phoneNumber.isValid("+123(34)5678-9000"));//больше цифр
        assertFalse(phoneNumber.isValid("+12(34)5678"));//меньше цифр

    }

    @Test
    public void testNumber_LessOrEqual255() {
        RegexValidator number = new RegexValidator("^([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

        assertTrue(number.isValid("255"));//максимальное значение
        assertTrue(number.isValid("0"));//минимальное значение
        assertTrue(number.isValid("128"));//рандомное значение в диапазоне от 0 до 255
        assertFalse(number.isValid("256"));//> 255
        assertFalse(number.isValid("-1"));//<0
        assertFalse(number.isValid("1000"));//больше 3х цифр
    }
}