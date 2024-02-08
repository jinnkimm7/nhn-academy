// 상속 전용으로 인스턴스를 생성할 수 없는 클래스가 된다.
public abstract class Unit {
  protected int location;
  protected int hp;
  protected int attackPower;

  public Unit(int location, int hp, int attackPower) {
    this.location = location;
    this.hp = hp;
    this.attackPower = attackPower;
  }

  public int getLocation() {
    return this.location;
  }

  public int getHp() {
    return this.hp;
  }

  public void move(int location) {
    this.location = location;
  }

  public void setHp(Unit unit) {
    this.hp -= unit.attackPower;
  }

  // public void attack(Unit unit) {
  // System.out.println("어택");
  // unit.setHp(this);
  // }
}
