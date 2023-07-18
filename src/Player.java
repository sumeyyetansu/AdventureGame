import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player{

    private int Id;
    private String name;
    private int damage;
    private int health;
    private int money;
    private int orjHealth;
    private static final int FIRST = 50;
    private Inventory inventory;

    private List<String> awardList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public List<String> getAwardList() {
        return awardList;
    }

    public void setAwardList(List<String> awardList) {
        this.awardList = awardList;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getOrjHealth() {
        return orjHealth ;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void selectChar(){

        System.out.println("They are your chars !");

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Chars");

        for (GameChar gameChar: charList){
            System.out.println("---------------\n"
                    + gameChar.getName() + " =>" + "\nId: "
                    + gameChar.getId() + "\nDamage: "
                    + gameChar.getDamage() + "\nHealth: "
                    + gameChar.getHealth() + "\nMoney:"
                    + gameChar.getMoney() + "\n---------------");
        }
        System.out.println("Select to char .Enter the char's id:");
        String charId = scanner.nextLine();


        if(charId .equals("1")){
            initPlayer(new Samurai());
        }
        else if (charId.equals("2")){
            initPlayer(new Archer());

        }
        else if (charId.equals("3")){
            initPlayer(new Knight());

        }
        else {
            System.out.println("Please Make a Valid Selection");
        }

    }
    public boolean first(){
        double randomvalue = Math.random() * 100;
        return randomvalue <= FIRST;
    }

    public void initPlayer(GameChar gameChar){
        setId(gameChar.getId());
        setName(gameChar.getName());
        setDamage(gameChar.getDamage());
        setHealth(gameChar.getHealth());
        setMoney(gameChar.getMoney());
        setOrjHealth(gameChar.getHealth());
    }
    public void showInfo(){
        System.out.println("Your char ==> " + getName() + "\n"
                + "Damage :" + getDamage() + "\n" + "Health : "
                + getHealth() + "\n" + "Money : " + getMoney() + "\n" + "Weapon : "
                + getInventory().getWeapon().getName() + "\n" + "Weapon Damage : " + getInventory().getWeapon().getDamage()
                + "\n" + "Armor : " + getInventory().getArmor().getName()
                + "\n" + "Armor Defence : " + getInventory().getArmor().getBlock()+ "\n"
        );
    }


}
