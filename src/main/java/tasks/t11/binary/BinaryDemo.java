package tasks.t11.binary;

import tasks.t11.User;

import java.io.*;

public class BinaryDemo {
    public static void main(String[] args) {
        User user = new User("ABC", 99);
        File file = serialization(user);
        User desUser = deserialization(file);
        System.out.println(desUser);
    }

    static File serialization(User user) {
        File file = null;
        try {
            file = new File("src/main/java/tasks/t11/binary/object.txt");
            if (!file.createNewFile())
                System.out.println("file already exist");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String path = file.getPath();
        try (FileOutputStream outputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return file;
    }

    static User deserialization(File file) {
        String path = file.getPath();
        User user = null;
        try(FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            user = (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
