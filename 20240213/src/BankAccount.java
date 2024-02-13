public class BankAccount {
  private int accountNo;
  private String ownerName;
  private long balance;

  public BankAccount(String ownerName, long balance) {
    // this.accountNo = ;
    this.ownerName = ownerName;
    this.balance = balance;
  }

  public int getAcountNo() {
    return this.accountNo;
  }

  public void setAccountNo(int amount) {
    this.accountNo = amount;
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public long getBalance() {
    return this.balance;
  }

  public void deposit(long amount) {
    this.balance += amount;
  }

  public boolean withdraw(long amount) {
    if(amount > this.balance) {
      return false;
    } else {
      this.balance -= amount;
      return true;
    }
  }

  public String toString() {
    return this.accountNo + ", " + this.ownerName + ", " + this.balance;
  }
}