package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven:");
        double milesDriven = input.nextDouble();

        System.out.println("Number of gallons used:");
        double gallonsUsed = input.nextDouble();
        input.close();

        System.out.println("The miles per gallon equals "+ milesDriven/gallonsUsed + "gallons.");
    }
}
