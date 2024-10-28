package homework_30_28_10.weekDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @Test
    public void testPlusDayPositive() {
        assertEquals(WeekDay.SATURDAY, WeekDay.WEDNESDAY.plusDay(3),
                "Wednesday + 3 days should be Saturday");
    }

    @Test
    public void testPlusDayNegative() {
        assertEquals(WeekDay.FRIDAY, WeekDay.MONDAY.plusDay(-3),
                "Monday - 3 days should be Friday");
    }

    @Test
    public void testPlusDayZero() {
        assertEquals(WeekDay.MONDAY, WeekDay.MONDAY.plusDay(0),
                "Monday + 0 days should still be Monday");
    }
}