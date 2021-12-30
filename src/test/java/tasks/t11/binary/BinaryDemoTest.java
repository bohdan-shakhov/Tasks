package tasks.t11.binary;

import org.junit.jupiter.api.Test;
import tasks.t11.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryDemoTest {
    @Test
    void serializationTest() throws IOException {
        User user = new User("ZXC", 20);
        File file = BinaryDemo.serialization(user);
        String stringTest = new String(Files.readAllBytes(Paths.get(BinaryDemo.serialization(user).getPath())));
        String s = new String(Files.readAllBytes(Paths.get(file.getPath())));
        assertEquals(stringTest, s);
    }

    @Test
    void deserialization() {
        User user = new User("ZXC", 20);
        File file = BinaryDemo.serialization(user);
        User user1 = BinaryDemo.deserialization(file);
        assertEquals(user1, user);
    }
}
