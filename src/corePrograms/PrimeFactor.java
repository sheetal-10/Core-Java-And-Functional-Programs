package corePrograms;

import java.util.Scanner;

/**
 * This is core java program for checking prime factors
 * @author Sheetal
 * @since 2021-08-08
 */
public class PrimeFactor {
	 /**
	 * This is the main method where
	 * we are taking no as a user input
	 * and calling other methods
	 */
	public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = s.nextInt();
	        primeFactors(number);
	    }
	    /**
	     * this boolean method is to check input no is prime or not
	     */
	    private static boolean isPrime(int number) {
	       boolean prime=true;
	    	    for(int i=2;i<number;i++)
	    	    {
	    	        if(number%i==0)
	    	        {
	    	            prime=false;
	    	            break;
	    	        }

	    	    }
	    	    return prime;
	    }

	    /**
	     * this method is to compute the prime factors
	     */
	    private static void primeFactors(int primeFactors) {
	        int i = 2;
	        while (primeFactors > 1) {
	            if (primeFactors%i == 0 && isPrime(i) == true) {
	                System.out.println(i);
	                primeFactors = primeFactors / i;
	            }
	            i++;
	        }
	    }
}
