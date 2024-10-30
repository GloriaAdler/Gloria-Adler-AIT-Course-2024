package homework_35_30_10.event.test;

import homework_35_30_10.event.dao.Calender;
import homework_35_30_10.event.dao.CalenderImpl;
import homework_35_30_10.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CalenderImplTest {

    Calender calender;
    Event [] events;

    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {

        calender = new CalenderImpl(5);
        events = new  Event[4];

        events[0] = new Event(1, "title 1", "url 1", now.plusDays(3));
        events[1] = new Event(2, "title 2", "url 2", now.plusDays(2));
        events[2] = new Event(3, "title 3", "url 3", now.plusDays(3));
        events[3] = new Event(4, "title 4", "url 4", now.plusDays(2));


        //        //TODO add events to calender
                for (int i = 0; i < 4; i++) {
                    calender.addEvent(events[i]);
                }
    }

    @Test
    void addEvent() {
        // Проверяем, что новое событие добавляется успешно
        Event newEvent = new Event(5, "title 5", "url 5", now.plusDays(5));
        assertTrue(calender.addEvent(newEvent));
        assertEquals(5, calender.size());
        // Проверяем, что не добавляется null-событие
        assertFalse(calender.addEvent(null));
        // Проверяем, что событие с дублирующимся eventId не добавляется
        Event duplicateEvent = new Event(1, "Duplicate title", "Duplicate url", now.plusDays(6));
        assertFalse(calender.addEvent(duplicateEvent));
        // Проверяем, что размер списка не изменился после попытки добавления null и дублирующегося события
        assertEquals(5, calender.size());
    }

    @Test
    void removeEvent() {
        assertTrue(calender.removeEvent(1));
        assertEquals(3, calender.size());
        assertNull(calender.getEventFromCalender(1));
    }

    @Test
    void updateEvent() {
        assertTrue(calender.updateEvent(2, "updated_url"));
        assertEquals("updated_url", calender.getEventFromCalender(2).getUrl());
    }

    @Test
    void getEventFromCalender() {
        assertEquals(events[0], calender.getEventFromCalender(1));
        assertNull(calender.getEventFromCalender(9)); // событие с таким ID не существует
    }

    @Test
    void getEventBetweenDate() {
        LocalDate dateFrom = now.toLocalDate();
        LocalDate dateTo = now.plusDays(3).toLocalDate();
        Event[] eventsInRange = calender.getEventBetweenDate(dateFrom, dateTo);
        assertEquals(4, eventsInRange.length); // Проверка, что метод возвращает правильные события в указанном диапазоне
        assertArrayEquals(new Event[]{events[0], events[1], events[2], events[3]}, eventsInRange);
    }

    @Test
    void size() {
        assertEquals(4, calender.size());
    }
}