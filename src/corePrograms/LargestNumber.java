package corePrograms;

import java.util.Scanner;

/**
 * This is core java program to Check largest of three numbers
 * @author Sheetal
 * @since 2021-08-08
 */
public class LargestNumber {

    /**
     * this is the main method which
     * takes three numbers from user
     * compares them and 
     * prints the largest among the three numbers
     */
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}
