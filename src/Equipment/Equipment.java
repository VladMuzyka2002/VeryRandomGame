package Equipment;
import Stats.Stats;

public abstract class Equipment {
    private Stats stats;
    public Equipment(int str, int agi, int stam, int _int){
        stats = new Stats(str, agi, stam, _int);
    }

    public Stats getStats() {
        return stats;
    }
}
