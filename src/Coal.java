import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Coal extends WarLoc{
    private String[] furniture;

    public String[] getFurniture() {
        return furniture;
    }

    public void setFurniture(String[] furniture) {
        this.furniture = furniture;
    }

    public Coal(Player player) {
        super(player, "Coal", new Snake(), "none", 6);
    }
    public void rand(){
       // setFurniture(new String[]{"Weapon", "Armor", "Money", "Nothing"}) ;
        List<String> furni = new ArrayList<String>(100);
        for(int i = 1; i < 16; i++){
            Random r = new Random();
            int index = r.nextInt(100)+1;
            furni.add(index,"Weapon");
        }



        Random r = new Random(100);
    }
    public void set() {
        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        for(Weapon w : Weapon.weapons())
        Weapon.weapons();
        if (result != 0) {

        }
    }
}
/*Silah Kazanma İhtimali : 15%


Tüfek Kazanma İhtimali : 20%


Kılıç Kazanma İhtimali : 30%


Tabanca Kazanma İhtimali : 50%


Zırh Kazanma İhtimali : 15%


Ağır Zırh Kazanma İhtimali : 20%


Orta Zırh Kazanma İhtimali : 30%


Hafif Zırh Kazanma İhtimali : 50%


Para Kazanma İhtimali : 25%


10 Para Kazanma İhtimali: 20%


5 Para Kazanma İhtimali: 30%


1 Para Kazanma İhtimali: 50%


Hiç birşey kazanamama ihtimali : 45%

 */