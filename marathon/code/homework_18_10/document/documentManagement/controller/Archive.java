package homework_18_10.document.documentManagement.controller;

import homework_18_10.document.documentManagement.model.Document;

//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.
public class Archive {

    private Document[] documents;// Массив для хранения документов
    private int size; // Текущий размер кол-во документов

    // Конструктор
    public Archive(int capasity) {
        this.documents = new Document[capasity];// Инициализация массива
        this.size = 0;//начальный размер
    }

    // CRUD methods

    public boolean addDocument(Document document){
        // negative cases
        if(document == null){ //документ отсутствует
            return false;
        }
        if(size == documents.length){ // Проверяем, заполнен ли массив
            return false;// массив заполнен целиком
        }
        if (!(findDocument(document.getDocumentNumber()) == null)){
            return false;// Документ с таким номером не существует
        }
        // positive case
        documents[size] = document;// Добавляем документ
        size++;
        return true;// Док добавлен
    }

    // print
    public void printDocuments(){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }

    public Document findDocument(long documentNumber){

        for (int i = 0; i < size; i++) {
            if(documents[i].getDocumentNumber() == documentNumber){
                return documents[i];
            }
        }
        return null;//если документ с нужным номером не найден, возвращаем null:
    }


    public Document removeDocument (long documentNumber){ // Метод для удаления документа по номеру

        for (int i = 0; i < size; i++) {//проходим по всему массиву
            if(documents[i].getDocumentNumber() == documentNumber){ // ищем совпадение переданного номера с имеющимися
                Document victim = documents[i];
                documents[i] = documents[size - 1];//заменяем удаляемый документ, последним документом в массиве
                // Затираем ссылку на последний документ, чтобы избежать утечек памяти:
                documents[size - 1] = null;//затираем последний элемент массива и уменьшаем size
                size--;
                return victim;
            }
        }
        return null; //если документ с нужным номером не найден, возвращаем null
    }

    public int size(){
        return size;
    }
}
