package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(900, 50);
        Weapon weapon = new Weapon("Diamond", "CrimeSword");
        System.out.println("Жизнь босса " + boss.getHealth() + " " + "Атака " + boss.getDamage()
                + "   "
         + weapon.getWeaponType()+ " "
        + weapon.getWeaponName());
    }


}



