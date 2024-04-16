package package3;

import java.util.Random;

public class DiceGame {
    public static void main (String[] arg ){

        int boardSpaces = 20;
        int maxRolls = 5;
        int totalRollValue = 0;
        int play = 0;

        for(int i = 0; i < maxRolls; i++){

            // Play Random numbers
            Random random = new Random();
            int diceValue = random.nextInt(6) + 1;
            play = play + 1;
            System.out.println("Roll " + play + " result :" + diceValue);

            totalRollValue += diceValue;
            System.out.println("Your total play :" + totalRollValue);

            // Check if user won or lost
            if(totalRollValue >= boardSpaces || i == maxRolls-1){
                if (totalRollValue == boardSpaces){
                    System.out.println("You won, you got to the " + boardSpaces +  "th space with " + play + " rolls");
                } else {
                    System.out.println("Oops, You lost");
                } break;
            }
        }
    }
}
