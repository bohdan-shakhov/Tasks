package tasks.t7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URIParseTest {
    @Test
    void testFUllURI(){
        URIParse expected = new URIParse("http", "www.ietf.org", "80", "/rfc/rfc2396.txt", "q=1&s1");
        URIParse actual = URIParse.parse("http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1");
        assertEquals(expected, actual);
    }

    @Test
    void testURIWithoutProtocol() {
        URIParse expected = new URIParse(null, "www.ietf.org", "80", "/rfc/rfc2396.txt", "q=1&s1");
        URIParse actual = URIParse.parse("://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1");
        assertEquals(expected, actual);
    }

    @Test
    void testUriWithoutPort() {
        URIParse expected = new URIParse("http", "www.ietf.org", null, "/rfc/rfc2396.txt", "q=1&s1");
        URIParse actual = URIParse.parse("http://www.ietf.org:/rfc/rfc2396.txt?q=1&s1");
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyURI() {
        URIParse expected = new URIParse(null, null, null, null, null);
        URIParse actual = URIParse.parse("");
        assertEquals(expected, actual);
    }

    @Test
    void testURIWithoutProtocolPortQuery() {
        URIParse expected = new URIParse(null, "www.ietf.org", null, "/rfc/rfc2396.txt", null);
        URIParse actual = URIParse.parse("://www.ietf.org:/rfc/rfc2396.txt");
        assertEquals(expected, actual);
    }
}
