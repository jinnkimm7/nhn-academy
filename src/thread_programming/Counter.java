package thread_programming;

public class Counter {
    String name;
    int count;
    int maxCount;

    public Counter(String name, int count, int maxCount) {
        this.name = name;
        this.count = count;
        this.maxCount = 10;
    }
    public void run() throws InterruptedException {
        while (count < maxCount) {
            count++;
            System.out.println(name + " : " + count);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter("counter", 0, 10);
        counter.run();
    }
}
