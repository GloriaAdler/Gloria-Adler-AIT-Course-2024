package homework_35_30_10.event.dao;


import homework_35_30_10.event.model.Event;

import java.time.LocalDate;

public interface Calender {

    boolean addEvent (Event event);

    boolean removeEvent (int eventId);

    boolean updateEvent (int eventId, String url);

    Event getEventFromCalender (int eventId);

    Event[] getEventBetweenDate (LocalDate dateFrom, LocalDate dateTo);

    int size ();
}
