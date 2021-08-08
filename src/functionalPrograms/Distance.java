package functionalPrograms;

import java.util.Scanner;

/**
 * This is a functional program for 
 * calculating the distane between origin and a point 
 * @author Sheetal
 * @since 2021-08-08
 */
public class Distance {
	
	/**
	 * this is the main method which
	 * take cooridinate values of a point from user and
	 * calculate the distance of that point from origin 
	 * using maths formula
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x coordinate value: ");
        int x = s.nextInt();
        System.out.print("Enter y coordinate value: ");
        int y = s.nextInt();

        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.printf("Euclidean Distance is %.2f", distance);
    }
}
