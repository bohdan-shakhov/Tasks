package tasks.t11.factorymethod.serializator;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import tasks.t11.factorymethod.User;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class XmlSerializator implements Serializable<User> {
    @Override
    public OutputStream serialize(User user) {
        OutputStream outputStream = new ByteArrayOutputStream();
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValue(outputStream, user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream;
    }

    @Override
    public User deserialize(InputStream inputStream) {
        XmlMapper mapper = new XmlMapper();
        User user = null;
        try {
            user = mapper.readValue(inputStream, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
