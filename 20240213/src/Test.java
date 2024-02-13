public class Test {
  public static void main(String[] args) {
    AccountNoCreator creator = AccountNoCreator.getAccountNoCreator();
    BankAccount bankAccount1 = new BankAccount("Kim", 0);
    bankAccount1.setAccountNo(creator.getAccountNo());

    System.out.println(bankAccount1);
    bankAccount1.deposit(10000);
    System.out.println(bankAccount1);

    AccountNoCreator creator2 = AccountNoCreator.getAccountNoCreator();
    BankAccount bankAccount2 = new BankAccount("Min", 100000);
    bankAccount2.setAccountNo(creator.getAccountNo());
    System.out.println(bankAccount2);

    BankAccount bankAccount3 = new BankAccount("Yu", 200000);
    bankAccount3.setAccountNo(creator2.getAccountNo());
    System.out.println(bankAccount3);
  }
}