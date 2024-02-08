/**
 * BankAccount
 */
public class BankAccount {
  private int balance;

  void deposit(int amount) {
    this.balance += amount;
  }

  void withdraw(int amount) {
    this.balance -= amount;
  }
}

class Test {
  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount();
    bankAccount1.deposit(100);
    // bankAccount1.balance = 100000;
  }
}