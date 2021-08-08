package corePrograms;

import java.util.Scanner;

/**
 * This is core java program for checking power of two
 * @author Sheetal
 * @since 2021-08-08
 */
public class PowerOfTwo {
	/**
	 * This method takes a command-line argument N and
	 * prints a table of the powers of 2 that are less than or equal to 2^N.
	 */
	public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;

        if (N>0 && N<31) {
            for (int i=1; i<=N; i++) {
                power = power * 2;
                System.out.println(2 + " to the power " + i + " : " + power);
            }
        } else {
            System.out.println("It exceeds the 'int' datatype limit");
        }
    }
}
