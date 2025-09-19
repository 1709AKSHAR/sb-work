package day3;
import java.util.Scanner;
public class q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        long factorial = 1;

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
