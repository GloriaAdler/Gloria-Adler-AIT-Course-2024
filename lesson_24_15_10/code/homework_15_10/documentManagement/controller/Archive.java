package homework_15_10.documentManagement.controller;
import homework_15_10.documentManagement.model.Document;
//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.
public class Archive {

    private Document [] documents;// Массив для хранения документов
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
    //!!!!!!!
    public  Document findDocument(long documentNumber){
        // Проходим по всем документам в массиве:
        for (int i = 0; i < size; i++) {
            // Проверяем, совпадает ли ИИН текущего документа с переданным ИИН
            // documents[i].getIin() возвращает ИИН текущего документа
            if(documents[i].getDocumentNumber() == documentNumber){// Убеждаемся, что вызов getIin() корректный
                return documents[i];                  // Возвращаем найденный документ
            }
        }
        // Если документ с указанным ИИН не найден, возвращаем null:
        return null;
    }


    // Метод для удаления документа по уникальному идентификационному номеру (IIN):
    public Document removeDocument (long documentNumber){
        // Проходим по всем документам в массиве:
        for (int i = 0; i < size; i++) {
            // Проверяем, совпадает ли IIN текущего документа с переданным IIN:
            if(documents[i].getDocumentNumber() == documentNumber){
                // Сохраняем ссылку на документ, который будем удалять (жертва):
                Document victim = documents[i];
                // Заменяем удаляемый документ последним документом в массиве:
                documents[i] = documents[size - 1];
                // Затираем ссылку на последний документ, чтобы избежать утечек памяти:
                documents[size - 1] = null;
                // Уменьшаем размер массива на 1, так как один документ удален
                size--;
                // Возвращаем ссылку на удалённый документ
                return victim;
            }
        }
        return null; // Если документ с указанным IIN не найден, возвращаем null
    }

    // boolean updateDocument()

    public int size(){
        return size;
    }

}
