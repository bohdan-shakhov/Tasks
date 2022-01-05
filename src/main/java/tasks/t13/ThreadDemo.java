package tasks.t13;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadDemo {
    public static void main(String[] args) {
        ConsumerThread consumerThread = new ConsumerThread();
        ProducerThread producerThread = new ProducerThread();
        AtomicBoolean flag = new AtomicBoolean(false);

        producerThread.incThreadPool(1, flag);
        consumerThread.decThreadPool(5, flag);
    }
}
