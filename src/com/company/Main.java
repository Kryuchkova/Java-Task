package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double principal;  // the value of the investment
        double rate;       // the annual interest rate
        double interest;   // the interest earned during the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial investment: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        rate = scanner.nextDouble();

        principal += principal * rate / 100;

        System.out.println("The value of the investment after one year is: "+principal);
    }
}
