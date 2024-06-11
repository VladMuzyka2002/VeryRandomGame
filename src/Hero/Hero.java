package Hero;

import Equipment.*;
import Stats.Stats;

public class Hero {
    private int level;
    private int xp;
    private int xp_till_next_level;
    private int max_health;
    private int current_health;
    private HeroEquipment equipment;
    private Stats stats;
    public Hero(){
        equipment = new HeroEquipment();
        level = 1;
        xp = 0;
        xp_till_next_level = 10;
        max_health = 10;
        current_health = max_health;
        stats = new Stats(1, 1, 1, 1);

    }

    public Stats getHeroStats(){
        return new Stats(
                getAllItemSingleStat("strength") + stats.getStrength(),
                getAllItemSingleStat("agility") + stats.getStamina(),
                getAllItemSingleStat("stamina") + stats.getAgility(),
                getAllItemSingleStat("intellect") + stats.getIntellect()
        );
    }

    private int getAllItemSingleStat(String stat){
        int stat_val = 0;
        stat_val += getSingleItemSingleStat(equipment.getHelm(), stat);
        stat_val += getSingleItemSingleStat(equipment.getChest(), stat);
        stat_val += getSingleItemSingleStat(equipment.getPants(), stat);
        stat_val += getSingleItemSingleStat(equipment.getBoots(), stat);
        stat_val += getSingleItemSingleStat(equipment.getWeapon(), stat);
        return stat_val;
    }

    private int getSingleItemSingleStat(Equipment item, String stat){
        if (item == null) return 0;
        if (stat.equalsIgnoreCase("strength")) return item.getStats().getStrength();
        if (stat.equalsIgnoreCase("agility")) return item.getStats().getAgility();
        if (stat.equalsIgnoreCase("stamina")) return item.getStats().getStamina();
        if (stat.equalsIgnoreCase("intellect")) return item.getStats().getIntellect();
        return 0;
    }

    public int getWeaponPower(){
        if (equipment.getWeapon() != null) return equipment.getWeapon().getWeaponPower();
        return 1;
    }


    public void printStats(){
        Stats totalStats = getHeroStats();
        System.out.println("Level: " + level);
        System.out.println("Health: " + current_health + "/" + max_health);
        System.out.println("XP: " + xp + "/" + xp_till_next_level);
        System.out.println();
        System.out.println("Strength: " + totalStats.getStrength());
        System.out.println("Agility: " + totalStats.getAgility());
        System.out.println("Stamina: " + totalStats.getStamina());
        System.out.println("Intellect: " + totalStats.getIntellect());
        System.out.println("Weapon Power: " + getWeaponPower());
    }

    public HeroEquipment getEquipment() {
        return equipment;
    }
}
