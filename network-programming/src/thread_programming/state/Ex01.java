package thread_programming.state;

public class Ex01 {
    public static void main(String[] args) {
        Thread thread = new Thread();

        System.out.println(thread.getState()); // NEW
    }
}
