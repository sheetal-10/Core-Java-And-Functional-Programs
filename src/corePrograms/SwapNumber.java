package corePrograms;

import java.util.Scanner;

/**
 * This is core java program to compute swapping of numbers
 * @author Sheetal
 * @since 2021-08-08
 */
public class SwapNumber {
	 static int temp;
	    /**
	     * this is the main method which
	     * takes 2 numbers as user inputs
	     * compute swaping of that 2 numbers
	     * and prints the swapped number
	     */
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter 1st number: ");
	        int num1 = s.nextInt();
	        System.out.print("Enter 2nd number: ");
	        int num2 = s.nextInt();
	        System.out.println("Numbers before swapping.");
	        System.out.println("num1 =" + num1);
	        System.out.println("num2 =" + num2);

	        temp = num1;
	        num1 = num2;
	        num2 = temp;
	        System.out.println("Numbers after swapping.");
	        System.out.println("num1 =" + num1);
	        System.out.println("num2 =" + num2);
	    }
}
