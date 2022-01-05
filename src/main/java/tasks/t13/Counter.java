package tasks.t13;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static final AtomicInteger counter = new AtomicInteger(50);

    public void changeNumber(boolean command) {
            if (command) {
                counter.incrementAndGet();
            } else {
                counter.decrementAndGet();
            }
    }

    public synchronized int getCounter() {
        return counter.get();
    }

    public void setCounter(int n) {
        counter.set(n);
    }
}
