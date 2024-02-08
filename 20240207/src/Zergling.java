public class Zergling extends Unit implements Attackerable {
  public Zergling(int location, int hp, int attackPower) {
    super(location, hp, attackPower);
  }

  @Override
  public void attack(Unit unit) {
    System.out.println("할퀴기");
    unit.setHp(this);
  }
}