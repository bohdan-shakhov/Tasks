package tasks.t11.factorymethod.picker;

import tasks.t11.factorymethod.serializator.Serializable;

public interface SerializatorPicker<T> {
    Serializable<T> createSerializator();
}
