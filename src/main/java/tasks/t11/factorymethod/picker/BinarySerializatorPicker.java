package tasks.t11.factorymethod;

public class BinarySerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new BinarySerializator();
    }
}
