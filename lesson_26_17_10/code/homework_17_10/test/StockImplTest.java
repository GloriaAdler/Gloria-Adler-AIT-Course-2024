package homework_17_10.test;

import classwork_15_10.book_library.model.Book;
import homework_17_10.dao.Stock;
import homework_17_10.dao.StockImpl;
import homework_17_10.model.Detail;
import homework_17_10.model.Gear;
import homework_17_10.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {

    Stock stock;
    Detail [] details;
    int size = 0;

    @BeforeEach
    void setUp (){

        stock = new StockImpl (10);
        details = new Detail[10];
        details[0] = new Gear(1234567890, 5.5, "Metal", "AAA", 50, 5, 100);
        details[1] = new Lever(1234567891, 5.5, "Metal", "BBB", 10, 20);
        details[2] = new Gear(1234567892, 5.5, "Metal", "CCC", 90, 5, 100);
        details[3] = new Lever(1234567893, 5.5, "Metal", "DDD", 70, 10);
        details[4] = new Gear(1234567894, 5.5, "Metal", "EEE", 40, 5, 100);
        details[5] = new Lever(1234567895, 5.5, "Metal", "FFF", 110, 5);
        details[6] = new Gear(1234567896, 5.5, "Metal", "GGG", 55, 5, 100);
        details[7] = new Lever(1234567897, 5.5, "Metal", "HHH", 35, 15);
        details[8] = new Gear(1234567898, 5.5, "Metal", "III", 50, 5, 100);

    }

    @Test
    void addDetailTest() {
        assertFalse(stock.addDetail(details[0])); //- не добавлять дубликат
        assertFalse (stock.addDetail (null)); //- не добавлять null

        Detail newDetails = new Gear(1234567899, 1, "Metal", "JJJ", 120, 10,200); //добавляем еще одну деталь
        assertFalse(stock.addDetail(newDetails));
        assertEquals(10, (details.length));
        Detail oneMoreDetail = new Gear(1234567888, 10, "Metal", "JJJ", 120, 10,200); //добавляем еще одну деталь сверх capacity (вместимости)
        assertFalse(stock.addDetail(oneMoreDetail));
    }

    @Test
    void findDetailTest() {
        Detail fundDelail = stock.findDetail(1234567890);
        assertEquals(details[0], stock.findDetail(1234567890));
        assertNull(stock.findDetail(1234567890));
    }

    @Test
    void updateDetailTest() {
        Detail newDetails = new Gear(1234567877, 5, "Metal", "KKK", 150, 5, 150);
        stock.updateDetail(newDetails);
        assertFalse(stock.addDetail(newDetails));
    }

    @Test
    void removeDetailTest() {
        assertEquals(details[0], stock.removeDetail(1234567890));;//сделали удаление существующей детали
    }

    @Test
    void totalWeightTest() {

        stock.addDetail(details[0]);
        stock.addDetail(details[1]);
        assertEquals(60, stock.totalWeight(), 0.001);//50+10=60 кг.
    }

    @Test
    void averageWeightTest() {
        stock.addDetail(details[0]);
        stock.addDetail(details[1]);
        assertEquals(30, stock.averageWeight(), 0.001);
    }
}