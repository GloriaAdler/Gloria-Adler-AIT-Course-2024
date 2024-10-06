package homework.iban.model;
//Задание 3.(*) Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину
// (в Германии - 22 символа). Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:

//lengthCode(String code), который возвращает количество символов в счете
//controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//isValid(String code), который проверяет штрих-код на правильное количество символов
public class IbanCode {
    private String code;  // Поле для хранения IBAN-кода

    public IbanCode(String code) { // Конструктор для инициализации IBAN-кода
        this.code = code;
    }

    public int lengthCode() {// Метод для возврата кол-ва символов в IBAN-коде
        return code.length();
    }

    public int controlCode() { // Метод для возврата суммы ASCII-кодов первых двух символов, напр: DE - ASCII-код заглавной D — это 68, Е - 69 68+69=137 (A — это 65).
        if (code.length() < 2) {
            System.out.println("Error: The IBAN code must contain at least 2 characters.");//Ошибка: IBAN-код должен содержать минимум 2 символа.
            return -1;
        }

        if (!Character.isLetter(code.charAt(0)) || !Character.isLetter(code.charAt(1))) {// Проверка, что первые два символа являются буквами
            System.out.println("Error: The IBAN code must contain at least 2 characters.");
            return -1;
        }
        return code.charAt(0) + code.charAt(1);
    }

    public boolean isValid() { // Метод для проверки, правильная ли длина IBAN-кода (в Германии - 22 символа)...
        return code.length() == 22 && Character.isLetter(code.charAt(0)) && Character.isLetter(code.charAt(1));//...значит длину кода делаем равной 22, а также проверяем содержит ли длина 2 символа
    }

    public void display() {// выводим на экран информацию о IBAN
        System.out.println("IBAN-code: " + code);
        System.out.println("Code length: " + lengthCode());
        System.out.println("Sum ASCII: " + controlCode());
        System.out.println("The correct length: " + (isValid() ? "Yes" : "No"));
        System.out.println();
    }

}
