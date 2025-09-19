package CLASSWORK;
import java.util.Scanner; 
public class q7 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        double km = inputScanner.nextDouble();
        final double cf = 0.621371;
        double miles = km * cf;
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        inputScanner.close();
    }
}