package homework.document.documentManagement;

import homework.document.documentManagement.controller.Archive;
import homework.document.documentManagement.model.Document;

public class DocumentAppl {
    public static void main(String[] args) {

        Archive archive = new Archive(3); // Создаем архив с вместимостью 3 документа

        // Создаем несколько документов
        Document doc1 = new Document(1111111110);
        Document doc2 = new Document(1111111111);
        Document doc3 = new Document(1111111112);

        // Добавляем документы в архив
        archive.addDocument(doc1);
        archive.addDocument(doc2);
        archive.addDocument(doc3);

        // Пробуем добавить еще один документ, когда архив уже заполнен
        Document doc4 = new Document(1234567895);
        archive.addDocument(doc4); // Этот документ не добавится, архив заполнен

        // Ищем документ по номеру
        Document foundDoc = archive.findDocument(1111111110);
        if (foundDoc != null) {
            System.out.println("Найден документ: " + foundDoc);
        }

        // Печатаем все документы в архиве
        archive.printDocuments();

    }

}
