package tasks.t2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LuckyTicketTest {
    static List<String> list;
    @BeforeAll
    static void setup() {
        list = LuckyTicket.luckyTickets();
    }
    @Test
    void testFirstLuckyTicket() {
        String expected = "000000";
        String actual = list.get(0);

        assertEquals(expected, actual);
    }

    @Test
    void testLatsLuckyTicket() {
        String expected = "999999";
        String actual = list.get(list.size() - 1);

        assertEquals(expected, actual);
    }
}
