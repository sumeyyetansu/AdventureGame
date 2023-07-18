public abstract class Monster {
    private int Id;
    private String name;
    private int damage;
    private int health;
    private int orjHealth;
    private String money;
    private static final int FIRST = 50;



    public Monster(int id, String name, int damage, int health, String money) {
        Id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.orjHealth = health;

    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjDamage) {
        this.orjHealth = orjDamage;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public abstract int createMonster();
    public void showToFeature(){
        System.out.println("---------------------\n"
                +getName() + "\n" +
                "id : " + getId() + "\n" +
                "damage :" + getDamage() + "\n" +
                "health :" + getHealth() + "\n" +
                "money: " + getMoney() + "\n" +
                "---------------------");
    }
}
