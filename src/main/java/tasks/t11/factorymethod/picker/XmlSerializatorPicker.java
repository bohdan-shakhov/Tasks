package tasks.t11.factorymethod;

public class XmlSerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new XmlSerializator();
    }
}
