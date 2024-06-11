package Input;

import java.util.Scanner;

public class UserInputToolbox {
    private Scanner scanner;
    public UserInputToolbox(){
        scanner = new Scanner(System.in);
    }
    public int getUserMove(){
        String input = "";
        boolean isValidInput = false;
        while (!isValidInput){
            System.out.println("Please Say Which Action to Take");
            System.out.println("1: Fight");
            System.out.println("2: See Stats");
            System.out.println("0: Exit");
            input = scanner.nextLine();
            if (input.equals("1") || input.equals("2") || input.equals("0")) isValidInput = true;
            else System.out.println("Invalid Input, try again");
        }
        return Integer.parseInt(input);
    }
}
