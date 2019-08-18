package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter three integers:");

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if (x > y && x > z)
        {
            System.out.println("First number is largest.");
        }
        else if  (y > x && y > z)
        {
            System.out.println("Second number is largest.");
        }
        else if  (z > x && z > y)
        {
            System.out.println("Third number is largest.");
        }
        else if  (y >= x && y >= z || x >= y && x >= z || z >= x && z >= y)
        {
            System.out.println("Entered numbers are not distinct.");
        }
    }
}
