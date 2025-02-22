import java.util.*;
import java.lang.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */


public class Main {

    public void GuessGame() {
        Random random = new Random();
        int rightGuess =random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int guess = 0, lastGuess = -1, guessCount = 0;
        do {
            System.out.println("Guess a number between 1 - 100!");
             guess = scanner.nextInt();
            if(guess > rightGuess){
                System.out.println("Too big!");
            } else if (guess < rightGuess){
                System.out.println("Too small!");
            }
            if(lastGuess != guess){
                guessCount++;
            }
            lastGuess = guess;

        } while (guess != rightGuess);

        System.out.println("Congratulations! You got it in " + guessCount + " tries!");


    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.GuessGame();


        
    }
}
