import java.util.Random;

public class Zombie extends Monster {

    public Zombie() {
        super(1, "Zombie",3, 10, "4");
    }

    @Override
    public int createMonster() {
        int number = (int)Math.random() * 3;
        for(int i = 0; i < number; i++){
            i++;
            Zombie zombie = new Zombie();
        }
        return number;
    }
}
