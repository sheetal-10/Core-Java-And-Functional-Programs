package functionalPrograms;

import java.util.Scanner;

/**
 * This is a functional program for 
 * reading in 2D arrays of integers, doubles or booleans.
 * @author Sheetal
 * @since 2021-08-08
 */
public class TwoDArray {
	/**
	 * This is the main method which
	 * takes M*N inputs for 2D Array
	 * creates 2 dimensional array in memory to read in M rows and N cols and
	 * print 2 Dimensional Array.
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size of an array: ");
        int arrayRowSize = s.nextInt();
        System.out.print("Enter the column size of an array: ");
        int arrayColSize = s.nextInt();

        int[][] arrayName = new int[arrayRowSize][arrayColSize];  

       
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColSize; j++) {
                System.out.println("Enter a value: ");
                arrayName[i][j]=s.nextInt();
            }
        }

   
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColSize; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
