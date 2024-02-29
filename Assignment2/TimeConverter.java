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

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int timeInSeconds = scanner.nextInt();
        int hours = timeInSeconds / 3600;
        int remainingSeconds = timeInSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.printf("Time in HH:mm:ss format: %02d:%02d:%02d\n", hours, minutes, seconds);
        scanner.close();
    }
}
