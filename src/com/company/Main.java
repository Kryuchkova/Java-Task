package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a temperature in Celsius: ");
        Scanner scanCelsius = new Scanner(System.in);
        double Fahrenheit = 0;
        int Celsius = scanCelsius.nextInt();
        Fahrenheit = Celsius * 1.8 + 32.0;

        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
    }
}
