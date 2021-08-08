package corePrograms;

import java.util.Scanner;

/**
 * This is core java program for printing Nth harmonic number
 * @author Sheetal
 * @since 2021-08-08
 */
public class HarmonicSeries {
	/**
	 * this method takes a harmonic no as user input
	 * compute the formula and 
	 * prints the Nth harmonic no as output
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        double harmonicNum = 0;

        if (num>0) {
            for (int i=1; i<=num; i++) {
                harmonicNum = harmonicNum + (1.0/i);
            }
            System.out.printf("Harmonic number is: %.4f ", harmonicNum);
        } else {
            System.out.println("Number should be greater than 0.");
        }
    }
}
