package tasks.t13;

import java.util.concurrent.atomic.AtomicBoolean;

public class ConsumerThread {
    Counter counter = new Counter();
    void decThreadPool(int threadsCount, AtomicBoolean flag) {
        for (int i = 1; i <= threadsCount; i++) {
            int finalI = i;
            new Thread(() -> {
                while (!flag.get()) {
                    counter.changeNumber(false);
                    System.out.println(finalI + ". -- -> " + counter.getCounter());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (counter.getCounter() == 100 || counter.getCounter() == 0) {
                        boolean stop = stopThread();
                        flag.set(stop);
                    }
                }
            }).start();
        }
    }
    public boolean stopThread() {
        return true;
    }

}
