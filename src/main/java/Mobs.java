
public class Mobs {

    private int life;
    private int attack;
    private int defense;
    private int speed;
    private int money;
    private int level;
    private int xp;
    String name;
    //private int relLife;

    public Mobs(int h, int a, int d, int s, int m, int l, int x) {
        life = h;
        attack = a;
        defense = d;
        speed = s;
        money = m;
        level = l;
        xp = x;
        //  relLife = life;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void setLife(int o) {
        life -= o;
    }

    public void speedBoost(int k) {
        speed += k;
    }

    public void attackBoost(int k) {
        attack += k;
    }

    public void gainHealth(int k) {
        if (life + k > life) {
            life += k;
        }
    }

    public String getName() {
        return name;
    }

    String battlingMoves(Mobs mb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void takeDamage(int damage) {
        life -= damage;

        if (life < 0) {
            life = 0;
        }
    }
}
