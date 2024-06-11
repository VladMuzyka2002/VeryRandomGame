package Input;
import Hero.*;

public class InputParser {
    private Hero hero;

    public InputParser(Hero hero){
        this.hero = hero;
    }
    public boolean parse(int command){
        switch (command){
            case 1:
                System.out.println("Fighting");
                break;
            case 2:
                hero.printStats();
                break;
            case 0:
                System.out.println("Good Game!");
                return false;
        }
        return true;
    }
    public void setHero(Hero h){
        hero = h;
    }
}
