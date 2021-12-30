package tasks.t11.json;

import org.junit.jupiter.api.Test;
import tasks.t11.User;
import tasks.t11.binary.BinaryDemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class JsonDemoTest {
    @Test
    void test() throws IOException {
        User user = new User("ZCX", 16);
        File file = JsonDemo.serialization(user);
        String stringTest = new String(Files.readAllBytes(Paths.get(JsonDemo.serialization(user).getPath())));
        String s = new String(Files.readAllBytes(Paths.get(file.getPath())));
        assertEquals(stringTest, s);
    }

    @Test
    void test2() throws IOException {
        User user = new User("ZXC", 20);
        File file = JsonDemo.serialization(user);
        User user1 = JsonDemo.deserialization(file);
        assertEquals(user1, user);
    }
}
