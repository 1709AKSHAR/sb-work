package day5;
import java.util.Scanner;


public class q1 {
		   	    public int q1(int num) {
	        if (num > 0) {
	            return 1;  
	        } else if (num < 0) {
	            return -1;  
	        } else {
	            return 0;   
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        q1 checker = new q1();
	        	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();	       
	        int result = checker.q1(number); 
	        if (result == 1) {
	            System.out.println(number + " is Positive");
	        } else if (result == -1) {
	            System.out.println(number + " is Negative");
	        } else {
	            System.out.println(number + " is Zero");
	        }

	      
	    }
	}


