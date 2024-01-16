package thread_programming.state;

import thread_programming.RunnableCounter;

public class Ex02 {
    public static void main(String[] args) {
        RunnableCounter runnableCounter = new RunnableCounter("counter", 0, 10);
        Thread thread = new Thread(runnableCounter);
        System.out.println(thread.getState()); // NEW
        thread.start();

        System.out.println(thread.getState()); // RUNNABLE
    }
}
