package tasks.t13;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadDemo {
    public static void main(String[] args) {
        final ThreadFunctions functions = new ThreadFunctions();
        AtomicBoolean flag = new AtomicBoolean(false);

        functions.incThreadPool(1, flag);
        functions.decThreadPool(5, flag);
    }
}
