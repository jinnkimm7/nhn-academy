package thread_programming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableCounter implements Runnable {
    String name;
    int count;
    int maxCount;
    public RunnableCounter(String name, int count, int maxCount) {
        this.name = name;
        this.count = count;
        this.maxCount = maxCount;
    }
    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            System.out.println(name + " : " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableCounter("runnable counter1", 0, 10));
        Thread thread2 = new Thread(new RunnableCounter("runnable counter2", 0, 10));

//        thread1.start();
//        thread2.start();

        ExecutorService pool = Executors.newFixedThreadPool(1);
//        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(thread1);
        pool.execute(thread2);

        pool.shutdown();
    }
}
