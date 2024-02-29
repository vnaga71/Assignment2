/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author venka
 */
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        double heightInM = heightInCm / 100.0; 

        double bmi = calculateBMI(weight, heightInM);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        
        interpretBMI(bmi);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}