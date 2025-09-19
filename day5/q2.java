package day5;


	import java.util.Scanner;

	public class q2 {

	 	    public int[] findQuotientAndRemainder(int num1, int num2) {
	        int quotient = num1 / num2;
	        int remainder = num1 % num2;
	        return new int[] {quotient, remainder};
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        q2 calc = new q2();

	        
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	       
	        int[] result = calc.findQuotientAndRemainder(num1, num2);

	        // Printing results
	        System.out.println("Quotient = " + result[0]);
	        System.out.println("Remainder = " + result[1]);

	        sc.close();
	    }
	}


