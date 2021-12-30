package tasks.t11.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import tasks.t11.User;

import java.io.File;
import java.io.IOException;

public class XmlDemo {
    public static void main(String[] args) throws IOException {
        User user = new User("ZXC", 116);
        File file = serialization(user);
        User desUser = deserialization(file);
        System.out.println(desUser);
    }

    static File serialization(User user) throws IOException {
        File file = null;

        try {
           file = new File("src/main/java/tasks/t11/xml/object.xml");
            if (!file.createNewFile())
                System.out.println("file already exist");
        } catch (Exception e) {
            e.printStackTrace();
        }

        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(file, user);

        return file;
    }

    static User deserialization(File file) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(file, User.class);
    }
}
