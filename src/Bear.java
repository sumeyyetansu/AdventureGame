public class Bear extends Monster {


    public Bear() {
        super(3, "Bear",7, 20, "12");
    }


    @Override
    public int createMonster() {
        int number = (int) Math.random() * 3;
        for (int i = 0; i < number; i++) {
            i++;
            Bear bear = new Bear();
        }
        return number;
    }
}
