package CLASSWORK;

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a radius:");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println(area);
        sc.close();
    }
}