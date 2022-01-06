package tasks.t11.factorymethod.serializator;

import java.io.InputStream;
import java.io.OutputStream;

public interface Serializable<T> {
    OutputStream serialize(T t);
    T deserialize(InputStream inputStream);
}
