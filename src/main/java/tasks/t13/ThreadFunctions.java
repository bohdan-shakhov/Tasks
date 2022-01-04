package tasks.t13;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadFunctions {
    private final AtomicInteger counter = new AtomicInteger(50);

    public void changeNumber(boolean command) {
        synchronized (this) {
            if (command) {
                counter.incrementAndGet();
            } else {
                counter.decrementAndGet();
            }
        }
    }

    public synchronized int getCounter() {
        return this.counter.get();
    }

    public void setCounter(int n) {
        this.counter.set(n);
    }

    public boolean stopThread(boolean flag) {
        return true;
    }

    void incThreadPool(int threadsCount, AtomicBoolean flag) {
        for (int i = 1; i <= threadsCount; i++) {
            int finalI = i;
            new Thread(() -> {
                while (!flag.get()) {
                    changeNumber(true);
                    System.out.println(finalI + ". ++ -> " + getCounter());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (getCounter() == 0 || getCounter() == 100) {
                        boolean stop = stopThread(flag.get());
                        flag.set(stop);
                    }
                }
            }).start();
        }
    }

    void decThreadPool(int threadsCount, AtomicBoolean flag) {
        for (int i = 1; i <= threadsCount; i++) {
            int finalI = i;
            new Thread(() -> {
                while (!flag.get()) {
                    changeNumber(false);
                    System.out.println(finalI + ". -- -> " + getCounter());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (getCounter() == 100 || getCounter() == 0) {
                        boolean stop = stopThread(flag.get());
                        flag.set(stop);
                    }
                }
            }).start();
        }
    }
}
