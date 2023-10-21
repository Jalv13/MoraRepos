public class Monster extends Mobs {
    String name = "Monster";

    public Monster(int h, int a, int d, int s, int m, int l, int x) {
        super(h, a, d, s, m, l, x);
    }

    public String slice(Mobs mob) {
        int damage = getAttack() - mob.getDefense();
        if (damage > 0) {
            mob.takeDamage(damage);
            return "The " + getName() + " slices you for " + damage + " damage!";
        } else {
            return "The " + getName() + " slices you, but it has no effect!";
        }
    }
}
