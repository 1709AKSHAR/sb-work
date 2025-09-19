package CLASSWORK;
import java.util.Scanner;
public class q2{
  public static void main(String[] args)
  {
      Scanner user=new Scanner(System.in);
      System.out.println("enter the first number:");
      int a=user.nextInt();
      System.out.println("enter the second number:");
      int b=user.nextInt();
      System.out.println("sum:"+(a+b));
      user.close();
  }
}