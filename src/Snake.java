import java.util.Random;

public class Snake extends Monster{
    private String furniture;
    Random r = new Random();
    int low = 3;
    int high = 6;
    int result = r.nextInt(high-low) + low;
    public Snake() {
        super(4, "Snake", 0, 12, "0");
    }
    public void initSnake(){
        setDamage(result);
        setMoney(furniture);
    }

    @Override
    public int createMonster() {
        initSnake();
        int number = (int) Math.random() * 3;
        for (int i = 0; i < number; i++) {
            i++;
            Snake snake = new Snake();
        }
        return number;

    }
}
