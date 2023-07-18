public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int money;

    public  Weapon(String name, int id, int damage, int money) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public static  Weapon[] weapons(){
        Weapon[] weaponslist = new Weapon[3];
        weaponslist[0] = new Weapon("Gun", 1, 2, 25);
        weaponslist[1] = new Weapon("Sword", 2, 3, 35);
        weaponslist[2] = new Weapon("Rifle", 3, 7, 45);
        return weaponslist;
    }
    public static Weapon weaponIdSelect (int id){
        for(Weapon w : Weapon.weapons()){
            if(w.id == id){
                return w;
            }
        }
        return null;
    }
}
