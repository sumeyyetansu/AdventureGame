import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;
    private Monster monster;
    private static Scanner scanner = new Scanner(System.in);


    public Game() {
        this.player = player;
        this.location = location;
        this.monster = monster;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void selectLoc(Player player) {

        while (true){

            player.showInfo();
            System.out.println("Please select to where do you want : ");
            System.out.println("0-Exit");
            System.out.println("1-Safe House === You are safe here.You can renew your life.");
            System.out.println("2-Shop ===> Here you can shop and get inventories to aid you in your battle.");
            System.out.println("3-Cave===> Be careful, there are zombies here. If you pass this level, you can earn FOOD.");
            System.out.println("4-Forest===> Be careful, there are vampires here. If you pass this level, you can earn FİREWOOD.");
            System.out.println("5-River===> Be careful, there are bears here. If you pass this level, you can earn WATER.");

            int loc = scanner.nextInt();
                switch (loc) {
                    case 0 :
                        location = null;
                        break;
                    case 1 :
                        location = new SafeHause(player);
                        break;
                    case 2:
                        location = new Shop(player);
                        break;
                    case 3:
                        location = new Cave(player);
                        break;
                    case 4:
                        location = new Forest(player);
                        break;
                    case 5:
                        location = new River(player);
                        break;
                    default:
                        System.out.println("Invalid Region Try Again!");
                        break;
                }
                if (location == null){
                    System.out.println("Cheking For Exit");
                }
                if(!location.onLocation()){
                    System.out.println("GAME OVER!");
                    break;
                }
        }
    }
        public void startGame() {

            System.out.println("Welcome to game!");
            System.out.println("Please enter your name : ");
            String name = scanner.nextLine();
            Player player = new Player("name");
            System.out.println("Welcome " + name);
            player.selectChar();

            selectLoc(player);
        }

    }



