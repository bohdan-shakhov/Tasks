package tasks.t7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class URIParseTest {
    @Test
    void test(){
        URIParse uriParseTest1 = new URIParse("http", "www.ietf.org", "80", "/rfc/rfc2396.txt", "q=1&s1");
        URIParse uriParse1 = URIParse.parse("http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1");
        assertEquals(uriParseTest1, uriParse1);

        URIParse uriParseTest2 = new URIParse("http", "www.ietf.org", null, "/rfc/rfc2396.txt", "q=1&s1");
        URIParse uriParse2 = URIParse.parse("http://www.ietf.org:/rfc/rfc2396.txt?q=1&s1");
        assertEquals(uriParseTest2, uriParse2);

        URIParse uriParseTest3 = new URIParse(null, "www.ietf.org", null, "/rfc/rfc2396.txt", "q=1&s1");
        URIParse uriParse3 = URIParse.parse("://www.ietf.org:/rfc/rfc2396.txt?q=1&s1");
        assertEquals(uriParseTest2, uriParse2);
    }
}
