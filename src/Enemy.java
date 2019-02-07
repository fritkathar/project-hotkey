public class Enemy extends Hostile implements Attackable {
    private int visualRange = 500;
    private int attackRange = 150;
    private int damage = 5;
    private int speed = 1;
    private int life = 100;

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void act() {
        moveToPlayer(this.visualRange);
        attackPlayer(this.attackRange,this.damage);
        }
    }
