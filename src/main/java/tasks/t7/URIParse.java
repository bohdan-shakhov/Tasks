package tasks.t7;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URIParse {

    private final String protocol;
    private final String host;
    private final String port;
    private final String path;
    private final String query;

    public URIParse(String protocol, String host, String port, String path, String query) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.query = query;
    }

    public static void main(String[] args) {
        String text = "http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1";
        URIParse result = parse(text);
        System.out.println(result);
    }

    static URIParse parse(String uri) {
        String protocol;
        String host;
        String port;
        String path;
        String query;

        String regexp = "^([^:/?#]+):";
        protocol = getMatcher(uri, regexp);

        regexp = "//([^/?#]*):";
        host = getMatcher(uri, regexp);

        regexp = ":(\\d+)";
        port = getMatcher(uri, regexp);

        regexp = ":.*:([^?#]*)";
        path = getMatcher(uri, regexp);
        if (port != null)
            path = path.substring(2);

        regexp = "\\?(.*)";
        query = getMatcher(uri, regexp);

        return new URIParse(protocol, host, port, path, query);
    }

    private static String getMatcher(String uri, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(uri);
        String match = null;
        if (matcher.find())
            match = matcher.group(1);
        return match;
    }

    @Override
    public String toString() {
        return "protocol -> " + protocol + System.lineSeparator() +
                "host -> " + host + System.lineSeparator() +
                "port -> " + port + System.lineSeparator() +
                "path -> " + path + System.lineSeparator() +
                "query -> " + query + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URIParse uriParse = (URIParse) o;
        return Objects.equals(protocol, uriParse.protocol) && Objects.equals(host, uriParse.host) && Objects.equals(port, uriParse.port) && Objects.equals(path, uriParse.path) && Objects.equals(query, uriParse.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path, query);
    }
}
