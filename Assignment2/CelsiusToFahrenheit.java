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
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = 37.5;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}