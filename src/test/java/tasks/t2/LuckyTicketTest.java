package tasks.t2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LuckyTicketTest {
    @Test
    void test() {
        List<String> list = LuckyTicket.luckyTickets();
        String first = list.get(0);
        String last = list.get(list.size() - 1);

        assertEquals("000000", first);
        assertEquals("999999", last);
    }
}
