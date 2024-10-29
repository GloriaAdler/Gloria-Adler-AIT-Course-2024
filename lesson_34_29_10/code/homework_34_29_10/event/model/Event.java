package homework_34_29_10.event.model;

import java.time.LocalDateTime;
import java.util.Objects;

//Задача 3.(*) По аналогии с приложением Album начать делать приложение Event поля для Event (событие)
//id;
//title;
//url - Uniform Resource Locator;
//data.
public class Event implements Comparable <Event> {

    private int eventId;
    private String title;
    private String url;
    private LocalDateTime date;

    public Event(int eventId, String title, String url, LocalDateTime date) {
        this.eventId = eventId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getEventId() {
        return eventId;
    }
    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("eventId=").append(eventId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return eventId == event.eventId && Objects.equals(title, event.title) && Objects.equals(url, event.url) && Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, title, url, date);
    }

    //сортировка по умолчанию
    @Override
    public int compareTo(Event o) {
        return this.getDate().compareTo(o.getDate());
    }
}
