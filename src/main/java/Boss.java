public class Boss extends Monster {
    public Boss(int h, int a, int d, int s, int m, int l, int x) {
        super(h, a, d, s, m, l, x);
        String name = "boss";
       }

    public String attack(Hero hero) {
        int damage = this.getAttack() - hero.getDefense();
        if (damage > 0) {
            hero.takeDamage(damage);
            return this.name + " attacks the hero for " + damage + " damage!";
        } else {
            return this.name + " attacks, but the hero's defense is too high!";
        }
    }
}
