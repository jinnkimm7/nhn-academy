package thread_programming;

public class ThreadCounter extends Thread {
    String name;
    int count;
    int maxCount;

    public ThreadCounter(String name, int count, int maxCount) {
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
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        ThreadCounter threadCounter1 = new ThreadCounter("counter1", 0, 10);
        ThreadCounter threadCounter2 = new ThreadCounter("counter2", 0, 10);

//        threadCounter1.run();
//        threadCounter2.run();

        threadCounter1.start();
        threadCounter2.start();
    }
}
