package day3;
import java.util.Scanner;

public class q5 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7; 
        int userGuess;

        System.out.println("Guess the number!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess != secretNumber) {
                System.out.println("Wrong guess, try again!");
            }

        } while (userGuess != secretNumber);

        System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
        scanner.close();
    }
}
