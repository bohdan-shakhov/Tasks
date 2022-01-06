package tasks.t11.factorymethod.serializator;

import com.fasterxml.jackson.databind.ObjectMapper;
import tasks.t11.factorymethod.User;

import java.io.*;

public class JsonSerializator implements Serializable<User> {
    @Override
    public OutputStream serialize(User user) {
        OutputStream outputStream = new ByteArrayOutputStream();
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(outputStream, user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream;
    }

    @Override
    public User deserialize(InputStream inputStream) {
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
             user = mapper.readValue(inputStream, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
