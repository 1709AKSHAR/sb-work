package day3;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("\n=== MENU ===");
            System.out.println("1. Say Hello");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Display Current Time");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

         
            switch (choice) {
                case 1:
                    System.out.println("Hello there!");
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum: " + sum);
                    break;
                case 3:
                    System.out.println("Current time: " + java.time.LocalTime.now());
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 to 4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
