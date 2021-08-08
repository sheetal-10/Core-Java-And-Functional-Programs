package corePrograms;

import java.util.Scanner;

/**
 * This is core java program to compute quotient and reminder
 * @author Sheetal
 * @since 2021-08-08
 */
public class QuotientRemainder {
	/**
	 * this is the main method which
	 * takes dividend and divisor as input and compute them
	 * prints quotient and reminder as output
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int dividend = s.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = s.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}
