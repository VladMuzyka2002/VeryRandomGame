package Equipment;

import Equipment.Equipment;

public class Weapon extends Equipment {
    private int weapon_power;
    public Weapon(int str, int agi, int stam, int _int, int wpower) {
        super(str, agi, stam, _int);
        weapon_power = wpower;
    }

    public int getWeaponPower() {
        return weapon_power;
    }
}
