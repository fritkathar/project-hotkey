import java.util.List;
import java.util.Random;

public abstract class NPC extends MovingActor {
    private int speed = 1;
    private static final Random r = new Random();
    public Player getPlayer(int visualRange) {
        List<Player> playersInVisualRange = getObjectsInRange(visualRange, Player.class);
        if (playersInVisualRange.size() != 0) {
            return playersInVisualRange.get(0);
        }
        return null;
    }
    public Player getPlayer(){
        List<Player> playersInVisualRange = getWorld().getObjects(Player.class);
        if (playersInVisualRange.size() != 0) {
            return playersInVisualRange.get(0);
        }
        return null;

    }
    public void randomMove(){
        switch(r.nextInt(4)){
            case 0:
                moveDown(speed);
                break;
            case 1:
                moveLeft(speed);
                break;
            case 2:
                moveRight(speed);
                break;
            case 3:
                moveUp(speed);
                break;
        }
    }
}
