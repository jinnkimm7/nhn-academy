public class Zealot extends Unit implements Attackerable {
  public Zealot(int location, int hp, int attackPower) {
    super(location, hp, attackPower);
  }

  @Override
  public void attack(Unit unit) {
    System.out.println("찌르기");
    unit.setHp(this);
  }
}