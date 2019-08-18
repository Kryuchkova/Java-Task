package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked: ");
        int year = scanner.nextInt();
        boolean isLeapYear;

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
        System.out.println(isLeapYear);
    }
}
