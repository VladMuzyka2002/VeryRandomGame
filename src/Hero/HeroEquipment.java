package Hero;
import Equipment.*;

public class HeroEquipment {
    private Helm helm;
    private Chest chest;
    private Pants pants;
    private Boots boots;
    private Weapon weapon;

    public Helm getHelm() {
        return helm;
    }

    public Chest getChest() {
        return chest;
    }

    public Pants getPants() {
        return pants;
    }

    public Boots getBoots() {
        return boots;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
