package tasks.t11.factorymethod.picker;

import tasks.t11.factorymethod.serializator.BinarySerializator;
import tasks.t11.factorymethod.serializator.Serializable;
import tasks.t11.factorymethod.User;

public class BinarySerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new BinarySerializator();
    }
}
