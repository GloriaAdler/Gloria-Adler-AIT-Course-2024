package homework.document.documentManagement.model;

import java.util.Objects;

//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.
public class Document {

    public static final int ID_LENGTH = 10;//константа известной длины номера

    private long documentNumber; // Уникальный номер документа

    // Конструктор

    public Document(long documentNumber) {
        this.documentNumber = checkDocumentNumber (documentNumber);
    }

    private long checkDocumentNumber(long documentNumber) {
        if (countNumber (documentNumber)){ //проверить длину по кол-ву цифр в этом числе
            return documentNumber;
        }
        return -1; // сигнал того, что isbn не верный
    }

    private boolean countNumber (long documentNumber){
        int count = 0;
        long temp = documentNumber;
        while ((temp != 0)){
            temp = temp/10;
            count++;

        }
        return count == ID_LENGTH;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        if(checkDocumentNumber(documentNumber) > 0){// Проверяем, корректено ли введён номер
            this.documentNumber = documentNumber;
        }else { // Если нет, то выводим сообщение об ошибке:
            System.out.println("Namber is not correct.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document archive)) return false;
        return documentNumber == archive.documentNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(documentNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("documentNumber=").append(documentNumber);
        sb.append('}');
        return sb.toString();
    }
}
