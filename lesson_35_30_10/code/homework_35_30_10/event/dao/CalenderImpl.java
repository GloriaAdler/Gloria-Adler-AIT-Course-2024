package homework_35_30_10.event.dao;

import homework_35_30_10.event.model.Event;

import java.time.LocalDate;
import java.util.Arrays;

public class CalenderImpl  implements Calender{

    private Event[] events; // начальный массив элементов
    private int size; // отслеживает количество добавленных событий

    public CalenderImpl(int capasity) {
        this.events = new Event[capasity];
        this.size = 0;
    }

    @Override // Метод добавления события
    public boolean addEvent(Event event) {
        if (event == null) {
            return false; // Не добавляем null
        }
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == event.getEventId()) {
                return false; // Не добавляем событие с дублем eventId
            }
        }
        if (size == events.length) {
            // Увеличиваем размер массива в 2 раза, если он заполнен
            events = Arrays.copyOf(events, events.length * 2);
        }
        events[size] = event;
        size++;
        return true;
    }

    @Override // Метод удаления события по ID
    public boolean removeEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                // Сдвигаем все элементы после удаленного на одну позицию влево
                System.arraycopy(events, i + 1, events, i, size - i - 1);
                events[size - 1] = null; // Удаляем последний элемент
                size--;
                return true;
            }
        }
        return false; // событие с таким ID не найдено
    }

    @Override // Метод обновления URL события по ID
    public boolean updateEvent(int eventId, String url) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                events[i].setUrl(url); // обновляем URL
                return true;
            }
        }
        return false; // событие с таким ID не найдено
    }

    @Override // Метод получения события по ID
    public Event getEventFromCalender(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                return events[i];
            }
        }
        return null; // событие с таким ID не найдено
    }

    @Override // Метод получения событий в определённом диапазоне дат
    public Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Event[] result = new Event[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            LocalDate eventDate = events[i].getDate().toLocalDate();
            if ((eventDate.isAfter(dateFrom) || eventDate.isEqual(dateFrom)) &&
                    (eventDate.isBefore(dateTo) || eventDate.isEqual(dateTo))) {
                result[count] = events[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count); // возвращаем массив только с нужными событиями
    }

    @Override
    public int size() {
        return size;
    }
}
