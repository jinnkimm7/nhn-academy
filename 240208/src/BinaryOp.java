@FunctionalInterface
public interface BinaryOp {
  public int apply(int i, int j);
}

class Alog {
  public static int calc(BinaryOp binder ,int i, int j) {
    return binder.apply(i, j);
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println(Alog.calc((x, y) -> x + y, 1, 2));
  }
}