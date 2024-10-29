package homework_34_29_10.event.dao;

import homework_34_29_10.event.model.Event;

import java.time.LocalDate;

public interface Calender {

    boolean addEvent (Event event);

    boolean removeEvent (int eventld);

    boolean updateEvent (int eventld, String url);

    Event getEventFromCalender (int eventld);

    Event[] getEventBeetwenDate (LocalDate dateFrom, LocalDate dateTo);

    int size ();
}
