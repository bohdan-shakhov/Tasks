package tasks.t11.factorymethod;

public class JsonSerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new JsonSerializator();
    }
}
