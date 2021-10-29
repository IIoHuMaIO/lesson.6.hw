package com.company;

public class Boss extends GameEntity {
        public Boss( int health, int damage){
            super(health, damage);
        }

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
