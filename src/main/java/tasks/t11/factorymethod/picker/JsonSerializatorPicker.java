package tasks.t11.factorymethod.picker;

import tasks.t11.factorymethod.serializator.JsonSerializator;
import tasks.t11.factorymethod.serializator.Serializable;
import tasks.t11.factorymethod.User;

public class JsonSerializatorPicker implements SerializatorPicker<User> {
    @Override
    public Serializable<User> createSerializator() {
        return new JsonSerializator();
    }
}
