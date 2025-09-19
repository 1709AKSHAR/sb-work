package day3;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers to add. Enter a negative number to stop.");

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("Sum of all positive numbers entered: " + sum);
        scanner.close();
    }
}
