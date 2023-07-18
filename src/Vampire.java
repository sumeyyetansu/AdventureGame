public class Vampire extends Monster {

    public Vampire() {
        super(2, "vampire", 4, 14, "7");
    }

    @Override
    public int createMonster() {
        int number = (int) Math.random() * 3;
        for (int i = 0; i < number; i++) {
            i++;
            Vampire vampire = new Vampire();
        }
        return number;
    }
}
