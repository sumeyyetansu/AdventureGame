import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class WarLoc extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;
    private int first;

    public WarLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    @Override
    public boolean onLocation() {
        return combat();
    }

    public static void write(List<String> arr){
        System.out.print("Your awards: ");
            System.out.print( arr.toString());
    }

    public boolean combat() {
        if (getPlayer().getAwardList().contains(award)){
            System.out.println("You passed this level!");
        }
        else {
            int num = getMonster().createMonster();
            System.out.println("You are in " + getName() + ". This is your monster " + this.monster.getName() + ". You have " + num + " " + this.monster.getName());
            this.monster.showToFeature();
            int monsDam = this.monster.getDamage() - getPlayer().getInventory().getArmor().getBlock();
            this.monster.setDamage(monsDam);
            if (this.monster.getDamage() < 0) {
                this.monster.setDamage(0);
            }

            for (int i = 1; i < num + 1; i++) {

                this.monster.setHealth(this.monster.getOrjHealth());
                getPlayer().showInfo();
                System.out.println("You can <C>ombat or <R>un");
                String selectCase = scanner.nextLine();
                selectCase = selectCase.toUpperCase();
                if (selectCase.equals("C")) {
                    System.out.println(i + "." + this.monster.getName());
                    System.out.println("##########Start combat##########!");

                    if (getPlayer().first()) {

                        while (getPlayer().getHealth() > 0 && this.monster.getHealth() > 0) {
                            if (getPlayer().getHealth() > 0) {
                                hitPlayer();
                            }
                            if (this.monster.getHealth() > 0) {
                                hitMonster();
                            }
                            if (getPlayer().getHealth() < 0) {
                                return false;
                            }
                        }
                    } else {
                        while (getPlayer().getHealth() > 0 && this.monster.getHealth() > 0) {
                            if (this.monster.getHealth() > 0) {
                                hitMonster();
                            }
                            if (getPlayer().getHealth() > 0) {
                                hitPlayer();
                            }
                            if (getPlayer().getHealth() <= 0) {
                                return false;
                            }
                        }
                    }
                }
                if (i == num) {
                    System.out.println("You earn\n ===>" + award + "===<");
                    getPlayer().getAwardList();
                    getPlayer().getAwardList().add(award);
                    write((getPlayer().getAwardList()));
                    System.out.println("");
                    if(getPlayer().getAwardList().size() == 3){
                        System.out.println("Congratulations! You win !");
                    }
                }

            }
        }
        return true;
    }

    public int hitPlayer(){
        System.out.println("-------------------");
        System.out.println(getPlayer().getName() + " => " + this.monster.getName() + " " + getPlayer().getDamage() + " hit.");
        if (this.monster.getHealth() - getPlayer().getDamage() <= 0){
            this.monster.setHealth(0);
            System.out.println(this.monster.getName() + " health = " + this.monster.getHealth());
            System.out.println(this.monster.getName() + " is dead");
            System.out.println("You scraped money : " + monster.getMoney());
            System.out.println("");
            return 0;
        }
        this.monster.setHealth(this.monster.getHealth() - getPlayer().getDamage());
        System.out.println(this.monster.getName() + " health = " + this.monster.getHealth());
        return this.monster.getHealth();
    }
    public int hitMonster(){
        System.out.println("-------------------");
        System.out.println(this.monster.getName()+ " => " + getPlayer().getName()  + " " + this.monster.getDamage() + " hit.");
        if (getPlayer().getHealth() -this.monster.getDamage() <= 0){
            getPlayer().setHealth(0);
            System.out.println(getPlayer().getName() + " health = " +getPlayer().getHealth());
            System.out.println(getPlayer().getName() + " is dead");
            return 0;
        }
        getPlayer().setHealth(getPlayer().getHealth() - this.monster.getDamage());
        System.out.println(getPlayer().getName() + " health = " +getPlayer().getHealth());
        return getPlayer().getHealth();
    }

}


