package CLASSWORK;

import java.util.Scanner;
public class q5{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a principle:");
      int p=sc.nextInt();
      System.out.println("enter the rate:");
      int r=sc.nextInt();
      System.out.println("enter the time:");
      int t=sc.nextInt();
      int SI=(p*r*t)/100;
      System.out.println("simple interest:"+SI);
      sc.close();
  }
}