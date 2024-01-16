package thread_programming.synchronization.ex2;

public class SharedCount {
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // tag::synchronized[]
    public static synchronized void increment() {
//        setCount(getCount() + 1);
    }
    // end::synchronized[]

    public static void main(String[] args) {

    }
}
