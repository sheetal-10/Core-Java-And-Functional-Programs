package functionalPrograms;

import java.util.Scanner;

/**
 * This is a functional program that 
 * prints the wind chill
 * @author Sheetal
 * @since 2021-08-08
 */
public class WindChill {
	/**
	 * This is the main method that
	 * takes the temperature and wind speed from user and 
	 * calculates the wind chill and prints the value
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double t = s.nextDouble();
        System.out.print("Enter a wind speed (in miles per hr): ");
        double v = s.nextDouble();

        double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * (Math.pow(v, 0.16)));

        System.out.printf("Wind Chill is: %.2f", windChill);
    }
}
