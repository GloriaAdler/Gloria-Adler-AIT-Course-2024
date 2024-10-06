package homework.iban;
//Задание 3.(*) Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину
// (в Германии - 22 символа). Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:
//lengthCode(String code), который возвращает количество символов в счете
//controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//isValid(String code), который проверяет штрих-код на правильное количество символов

import homework.iban.model.IbanCode;

public class IbanCodeAppl {
    public static void main(String[] args) {

        IbanCode myIBAN = new IbanCode("DE10000000000000001111");
        myIBAN.display();

        IbanCode myIBAN2 = new IbanCode("DE100000000000001111");
        myIBAN2.display();

        IbanCode myIBAN3 = new IbanCode("DE1000000110000000001111");
        myIBAN3.display();

        IbanCode myIBAN4 = new IbanCode("1000000110000000001111");
        myIBAN4.display();

    }
}
