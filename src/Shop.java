public class Shop extends NormalLoc {
    public Shop(Player player) {
        super(player, "Shop");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to shop.");
        boolean showmenu = true;
        while (showmenu) {
            System.out.println("Please choose the item you want to buy :");
            String item = "1-Weapons :\n" +
                    "2-Amors :\n" +
                    "3-Çıkış ";
            System.out.println(item);
            int select = scanner.nextInt();
            while (select < 1 || select > 3) {
                System.out.println("Please Make a Valid Selection");
                System.out.println(item);
                select = scanner.nextInt();
            }

            switch (select) {
                case 1:
                    printWeapon();
                    buyWeaon();
                    break;
                case 2:
                    printAmor();
                    buyAmor();
                    break;
                case 3:
                    System.out.println("Checking out of store");
                    showmenu = false;
                    break;
                default:
                    System.out.println("Welcome to shop.Please choose the item you want to buy :");
                    item = "1-Weapons :\n" +
                            "2-Amors :\n" +
                            "3-Çıkış ";
            }
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("<<<<<<<<<<< Weapons >>>>>>>>>");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + "Name: " + w.getName()  +  "\n" + "Damege: " + w.getDamage() + "\n" + "Prize: " + w.getMoney() + "\n");
        }
        System.out.println("0-Exit");
    }

    public void buyWeaon() {
        System.out.println("Please Select A Weapon : ");
        int selectId = scanner.nextInt();

        while (selectId < 0 || selectId > Weapon.weapons().length) {
            System.out.println("Invalid Value Try Again!");
            selectId = scanner.nextInt();

        }
        Weapon weaponSelect = Weapon.weaponIdSelect(selectId);
        if ( selectId != 0) {
            if (weaponSelect.getMoney() > this.getPlayer().getMoney()) {
                System.out.println("You Don't Have Enough Money!");
            } else {

                int moneyUpdate = this.getPlayer().getMoney() - weaponSelect.getMoney();
                int damageUpdate = this.getPlayer().getDamage() - weaponSelect.getDamage();
                this.getPlayer().setMoney(moneyUpdate);
                this.getPlayer().setDamage(damageUpdate);
                System.out.println("Your Chose : " + weaponSelect.getName() + "\n" + "Your Update Money : " + this.getPlayer().getMoney());
                System.out.println("Your previous weapon : " + getPlayer().getInventory().getWeapon().getName() + "\n");
                this.getPlayer().getInventory().setWeapon(weaponSelect);
            }
        }
    }

    public void buyAmor() {
        System.out.println("Please Select A Amor : ");
        int selectId = scanner.nextInt();

        while (selectId < 0 || selectId > Weapon.weapons().length) {
            System.out.println("Invalid Value Try Again!");
            selectId = scanner.nextInt();

        }
        Armor armorSelect = Armor.amorIdSelect(selectId);
        if (selectId != 0) {
            if (armorSelect.getMoney() > this.getPlayer().getMoney()) {
                System.out.println("You Don't Have Enough Money!");
            } else {

                int moneyUpdt = this.getPlayer().getMoney() - armorSelect.getMoney();
                this.getPlayer().setMoney(moneyUpdt);

                System.out.println("Your Chose : " + armorSelect.getName() + "\n" + "Your Update Money : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setArmor(armorSelect);
            }
        }
    }

    public void printAmor() {
        System.out.println("<<<<<<<<<<<  Amors  >>>>>>>>>");
        for (Armor a : Armor.armors()) {
            System.out.println( a.getId() + "-" + "Name: " + a.getName()  + "\n" + "Damege: " + a.getBlock() + "\n" + "Prize: " + a.getMoney() + "\n");

        }
        System.out.println("0-Exit");
    }
}


