package Stats;
public class Stats {

    private int strength;
    private int agility;
    private int stamina;
    private int intellect;

    public Stats(int str, int agi, int stam, int _int){
        strength = str;
        agility = agi;
        stamina = stam;
        intellect = _int;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntellect() {
        return intellect;
    }
}
