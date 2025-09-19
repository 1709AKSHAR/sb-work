package CLASSWORK;

import java.util.Scanner;
public class q3 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a temperature in celsius:");
      int celsius=sc.nextInt();
      float fahrenheit=(celsius*(9/5))+32;
      System.out.println(fahrenheit);
      sc.close();
  }
}


