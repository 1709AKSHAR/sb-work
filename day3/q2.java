package day3;
import java.util.Scanner;
import static java.lang.System.out;
public class q2 {public static void main(String[] args)
{
    Scanner user=new Scanner(System.in);
    System.out.println("enter the first number:");
    int a=user.nextInt();
    System.out.println("enter the the second number:");
    int b=user.nextInt();
    System.out.println("1 means +");
    System.out.println("2 mean-:");
    System.out.println("3 means *:");
    System.out.println("4 means /:");
    System.out.println("enter the opettion:");
    int o=user.nextInt();
    switch (o) {
    case 1:
    	
    		System.out.println(a+b);
    	break;
    case 2:
    	if (o==2)
    		System.out.println(a-b);
    	break;
    case 3:
    	
    		System.out.println(a*b);
    	break;
    case 4:
    	if (o==4)
    		System.out.println(a/b);
    	break;
    	default:
    		System.out.println("itne paise me itna hi milega");
    		
    }
    
    }

}
