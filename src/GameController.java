import Hero.*;
import Input.*;

public class GameController {
    Hero hero;
    UserInputToolbox inputToolbox;
    InputParser parser;
    void start(){
        hero = new Hero();
        parser = new InputParser(hero);
        parser.setHero(hero);
        inputToolbox = new UserInputToolbox();
        gameLoop();
    }

    void gameLoop(){
        boolean isRunning = true;
        while (isRunning){
            int userChoice = inputToolbox.getUserMove();
            pageBreak();
            isRunning = parser.parse(userChoice);
            pageBreak();
        }
    }

    void pageBreak(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
