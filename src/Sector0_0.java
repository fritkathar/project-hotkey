public class Sector0_0 extends OpenWorld {

    public Sector0_0() {
        setBackground("cell_debug.png");
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        addObject(new Enemy(),100,100);
        HUD hud = new HUD();
        addObject(hud,getWidth()/2, getHeight()/2);

    }

}
