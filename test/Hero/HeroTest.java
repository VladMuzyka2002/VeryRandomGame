package Hero;
import Equipment.*;
import Stats.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HeroTest {

    @Test
    void HeroStatsAreAllOneAtStart() {
        Hero hero = new Hero();
        Stats stats = hero.getHeroStats();
        assertEquals(stats.getStrength(), 1);
        assertEquals(stats.getAgility(), 1);
        assertEquals(stats.getStamina(), 1);
        assertEquals(stats.getIntellect(), 1);
        assertEquals(hero.getWeaponPower(), 1);
    }

    @Test
    void HeroStatsAreAccurateWithWeaponEquipped() {
        Hero hero = new Hero();
        hero.getEquipment().setWeapon(new Weapon(10, 2, 5, 0, 13));
        Stats stats = hero.getHeroStats();
        assertEquals(stats.getStrength(), 11);
        assertEquals(stats.getAgility(), 3);
        assertEquals(stats.getStamina(), 6);
        assertEquals(stats.getIntellect(), 1);
        assertEquals(hero.getWeaponPower(), 13);
    }

    @Test
    void HeroStatsAreAccurateWithWeaponRemoved() {
        Hero hero = new Hero();
        hero.getEquipment().setWeapon(new Weapon(10, 2, 5, 0, 13));
        hero.getEquipment().setWeapon(null);
        Stats stats = hero.getHeroStats();
        assertEquals(stats.getStrength(), 1);
        assertEquals(stats.getAgility(), 1);
        assertEquals(stats.getStamina(), 1);
        assertEquals(stats.getIntellect(), 1);
        assertEquals(hero.getWeaponPower(), 1);
    }

    @Test
    void HeroStatsAreAccurateWithManyItems() {
        Hero hero = new Hero();
        hero.getEquipment().setHelm(new Helm(5, 3, 2, 1));
        hero.getEquipment().setChest(new Chest(1, 2, 7, 2));
        hero.getEquipment().setPants(new Pants(3, 3, 3, 4));
        hero.getEquipment().setBoots(new Boots(0, 6, 0, 0));
        hero.getEquipment().setWeapon(new Weapon(10, 2, 5, 0, 13));
        Stats stats = hero.getHeroStats();
        assertEquals(stats.getStrength(), 20);
        assertEquals(stats.getAgility(), 17);
        assertEquals(stats.getStamina(), 18);
        assertEquals(stats.getIntellect(), 8);
        assertEquals(hero.getWeaponPower(), 13);
    }

    @Test
    void HeroStatsAreAccurateWithManyItemsSomeRemoved() {
        Hero hero = new Hero();
        hero.getEquipment().setHelm(new Helm(5, 3, 2, 1));
        hero.getEquipment().setChest(new Chest(1, 2, 7, 2));
        hero.getEquipment().setPants(new Pants(3, 3, 3, 4));
        hero.getEquipment().setBoots(new Boots(0, 6, 0, 0));
        hero.getEquipment().setWeapon(new Weapon(10, 2, 5, 0, 13));
        hero.getEquipment().setHelm(null);
        hero.getEquipment().setChest(null);
        Stats stats = hero.getHeroStats();
        assertEquals(stats.getStrength(), 14);
        assertEquals(stats.getAgility(), 12);
        assertEquals(stats.getStamina(), 9);
        assertEquals(stats.getIntellect(), 5);
        assertEquals(hero.getWeaponPower(), 13);
    }
    //
}