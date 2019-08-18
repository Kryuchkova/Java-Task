package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter value a: ");
	    int a = s.nextInt();
        System.out.print("Enter value b: ");
        int b = s.nextInt();
        System.out.print("The result of adding is ");
        System.out.println(a + b);
        System.out.print("The result of subtracting is ");
        System.out.println(a - b);
        System.out.print("The result of multiplying is ");
        System.out.println(a * b);
        System.out.print("The result of dividing is ");
        System.out.println((float)(a / b));
    }
}
