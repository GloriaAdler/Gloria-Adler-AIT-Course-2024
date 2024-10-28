package homework_18_10.document.documentManagement.test;

import homework_18_10.document.documentManagement.controller.Archive;
import homework_18_10.document.documentManagement.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp() {
        archive = new Archive(4);
        documents = new Document[4];
        //массив
        documents[0] = new Document(1111111110);
        documents[1] = new Document(1111111111);
        documents[2] = new Document(1111111112);

        for (int i = 0; i < documents.length; i++) {
            archive.addDocument(documents[i]); //добавляем текущий документ из массива в архив
        }
    }

    @Test

    void addDocumentTest () {
        assertFalse(archive.addDocument(null));//не добавлять пустые номера
        assertFalse(archive.addDocument(documents[0]));//не добавлять дубликат
        Document newDocument = new Document(1111111113);//добавляем новый документ
        assertTrue(archive.addDocument(newDocument));
        assertEquals(4,archive.size());//размер вмещает новый документ
        Document oneMoreDocument = new Document(1111111114); //пробуем добывить еще один документ, сверх вместимости - capacity.
        assertFalse(archive.addDocument(oneMoreDocument));
    }


    @Test
    void findDocumentTest() {
        Document foundDocument = archive.findDocument(1111111110);
        //проверка поиска существующего документа
        assertEquals(documents[0],archive.findDocument(1111111110)); //найден
        //проверка поиска несуществующего документа
        assertNull(archive.findDocument(1111111119));// не найден
    }

    @Test
    void removeDocumentTest(){
        assertEquals(documents[0],archive.removeDocument(1111111110)); //удаление существующего документа
        assertEquals(2,archive.size());//проверка размера архива после удаления документа
        assertNull(archive.removeDocument(1111111119)); //удаление несуществующего документа
    }

    @Test

    void sizeTest(){
        assertEquals(3,archive.size()); //проверка размера архива

        archive.removeDocument(documents[0].getDocumentNumber());//проверка на изменение размера после удаления
        assertEquals(2, archive.size());
    }

    @Test
    void printDocumentsTest(){ //вывод документов на экран:
        System.out.println("------------------------------------------------");
        archive.printDocuments();
    }





}