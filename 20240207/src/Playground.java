public class Playground {
  public static void main(String[] args) {
    Unit z1 = new Zealot(1, 10, 3);
    Unit m1 = new Marine(2, 10, 1);
    Unit d1 = new Dragon(3, 20, 2);
    Zergling zergling1 = new Zergling(2, 8, 1);
    Unit medic1 = new Medic(1, 2, 3);

    // z1.attack(m1);
    // d1.attack(zergling1);
    // m1.attack(d1);

    Unit[] units = { z1, m1, d1, zergling1, medic1 };

    for (Unit unit : units) {
      // ((Attackerable) unit).attack(zergling1);

      if (unit instanceof Attackerable) {
        ((Attackerable) unit).attack(zergling1);
      }
    }

    System.out.println(m1.getHp());
    System.out.println(zergling1.getHp());
    System.out.println(d1.getHp());
  }
}