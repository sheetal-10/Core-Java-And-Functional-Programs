package functionalPrograms;

import java.util.Scanner;

/**
 * This is a functional program for 
 * find the roots of the equation a*x*x + b*x + c.
 * @author Sheetal
 * @since 2021-08-08
 */
public class Quadratic {
	/**
	 * This is the main method which
	 * takes three input values for quadratic equation
	 * prints the roots and delta value
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        double deltaValue = delta(a,b,c);  //call the 'delta' function
        System.out.println("Delta value: " + deltaValue);

        double root11 = root1(deltaValue, a, b);     // call the 'root1' function
        System.out.println("Root 1: " + root11);

        double root21 = root2(deltaValue, a, b);     // call the 'root2' function
        System.out.println("Root 2: " + root21);

    }

    // define a function 'delta', it will return delta value
    /**
     * This is the method to find delta value
     * @param a
     * @param b
     * @param c
     * @return delta value
     */
    private static double delta(double a, double b, double c) {
        double delta = (b*b)-(4.0*a*c);
        return delta;
    }

    /**
     * This is the method to find the 1st root
     * @param deltaVal
     * @param a
     * @param b
     * @return 1st root
     */
    private  static double root1(double deltaVal, double a, double b) {
        double root1 = (-b+Math.sqrt(deltaVal))/(2*a);
        return root1;
    }

    /**
     * This is the method to find the 2nd root
     * @param deltaVal
     * @param a
     * @param b
     * @return 2nd root
     */
    private  static double root2(double deltaVal, double a, double b) {
        double root2 = (b+Math.sqrt(deltaVal))/(2*a);
        return root2;
    }

}
