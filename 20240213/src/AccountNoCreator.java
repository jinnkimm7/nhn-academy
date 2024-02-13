public class AccountNoCreator {
  public static AccountNoCreator creator;
  private int nextAcountNo;

  // 외부에서 객체를 생성하지 못하도록 막아둡니다.
  private AccountNoCreator() {
    System.out.println("created!!");
  }

  public static AccountNoCreator getAccountNoCreator() {
    if (creator == null) {
      creator = new AccountNoCreator();
    }
    return creator;
  }

  public int getAccountNo() {
    return ++this.nextAcountNo;
  }
}