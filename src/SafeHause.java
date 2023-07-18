import java.util.Scanner;

public class SafeHause extends NormalLoc {


    public SafeHause(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in Safe House. Your healt is renewal :" + getPlayer().getOrjHealth());
            healthRenewal();
            getPlayer().setHealth(getPlayer().getOrjHealth());
        return true;
    }
    public void healthRenewal() {
        getPlayer().getOrjHealth();

    }
}
