package homework_39_5_11.courses;

import java.util.Objects;

public class Courses {

    private String name;

    public Courses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Courses courses)) return false;
        return Objects.equals(name, courses.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Courses{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
