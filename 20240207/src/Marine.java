public class Marine extends Unit implements Attackerable {
  public Marine(int location, int hp, int attackPower) {
    super(location, hp, attackPower);
  }

  @Override
  public void attack(Unit unit) {
    System.out.println("총쏘기");
    unit.setHp(this);
  }
}