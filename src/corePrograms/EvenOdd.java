package corePrograms;

import java.util.Scanner;

/**
 * This is core java program to check even or odd
 * @author Sheetal
 * @since 2021-08-08
 */
public class EvenOdd {
	/**
	 * this is the main method which 
	 * takes a number from user
	 * computes and checks for even or odd
	 * and prints the output
	 */
	public static void main(String[] args) {
        System.out.println("Check whether a number is odd or even.");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
    }
}
