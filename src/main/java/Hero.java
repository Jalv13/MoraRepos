public class Hero extends Mobs {
    private int battleCount;
    
    private int xp;
    public Hero(int h, int a, int d, int s, int m, int l, int x) {
        super(h, a, d, s, m, l, x);
        xp = 0;
    }

    public String strike(Mobs mob) {
        int damage = getAttack() - mob.getDefense();
        if (damage > 0) {
            mob.takeDamage(damage);
            return "You strike the " + mob.getName() + " for " + damage + " damage!";
        } else {
            return "You strike the " + mob.getName() + ", but it has no effect!";
        }
    }
           public int getXp(){
    return xp;
    }
    public void gainXP(int amount){
    xp += amount;
    }
    boolean slice(Monster monster){
    
        return false;
    
    }

    int getBattleCount() {
        int battleCount = 0;
     return battleCount;
    }

    void incrementBattleCount() {
        battleCount++;
    }
}

