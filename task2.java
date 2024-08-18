//gussing number game

import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int randomNumber = random.nextInt(100) + 1; //number will be 1 to 100
        int userGuess = 0;
        int numberOfAttempts = 0;

        System.out.println("Welcome to the guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}

