package tasks.t11.factorymethod;

import tasks.t11.factorymethod.picker.BinarySerializatorPicker;
import tasks.t11.factorymethod.picker.JsonSerializatorPicker;
import tasks.t11.factorymethod.picker.SerializatorPicker;
import tasks.t11.factorymethod.picker.XmlSerializatorPicker;
import tasks.t11.factorymethod.serializator.Serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class SerializatorDemo {
    public static void main(String[] args) {
        User user = new User("zxc", 15);
        SerializatorPicker<User> serializatorPicker = createSerializator("xml");
        Serializable<User> serializable = serializatorPicker.createSerializator();

        ByteArrayOutputStream outputStream = (ByteArrayOutputStream) serializable.serialize(user);
        byte[] bytes = outputStream.toByteArray();
        System.out.println(Arrays.toString(bytes));
        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println(serializable.deserialize(inputStream));

    }

    static SerializatorPicker<User> createSerializator(String typeOfFile) {
        if (typeOfFile.equalsIgnoreCase("binary")) {
            return new BinarySerializatorPicker();
        } else if (typeOfFile.equalsIgnoreCase("xml")) {
            return new XmlSerializatorPicker();
        } else if (typeOfFile.equalsIgnoreCase("json")) {
            return new JsonSerializatorPicker();
        }
        throw new IllegalArgumentException();
    }
}
