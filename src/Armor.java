public class Armor {
    private String name ;
    private int id;
    private int block;
    private int money;

    public Armor(String name, int id, int block, int money) {
        this.name = name;
        this.id = id;
        this.block = block;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public static  Armor[] armors(){
        Armor[] amorlist = new Armor[3];
        amorlist[0] = new Armor("Light", 1, 1, 15);
        amorlist[1] = new Armor("Medium", 2, 3, 25);
        amorlist[2] = new Armor("Heavy", 3, 5, 35);
        return amorlist;

    }
    public static Armor amorIdSelect (int id){
        for(Armor a : Armor.armors()){
            if( a.id== id){
                return a;
            }
        }
        return null;
    }
}
