package tasks.t11.factorymethod.picker;

import tasks.t11.factorymethod.serializator.Serializable;
import tasks.t11.factorymethod.User;
import tasks.t11.factorymethod.serializator.XmlSerializator;

public class XmlSerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new XmlSerializator();
    }
}
