package tasks.t13;

import java.util.concurrent.atomic.AtomicBoolean;

public class ProducerThread {
    Counter counter = new Counter();
    void incThreadPool(int threadsCount, AtomicBoolean flag) {
        for (int i = 1; i <= threadsCount; i++) {
            int finalI = i;
            new Thread(() -> {
                while (!flag.get()) {
                    counter.changeNumber(true);
                    System.out.println(finalI + ". ++ -> " + counter.getCounter());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (counter.getCounter() == 0 || counter.getCounter() == 100) {
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
