package tasks.t11.factorymethod.serializator;

import tasks.t11.factorymethod.User;

import java.io.*;

public class BinarySerializator implements Serializable<User> {
    @Override
    public OutputStream serialize(User user) {
        OutputStream outputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream os = new ObjectOutputStream(outputStream)) {
            os.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputStream;
    }

    @Override
    public User deserialize(InputStream inputStream) {
        User user = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            user = (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
