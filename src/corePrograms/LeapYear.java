package corePrograms;

import java.util.Scanner;

/**
 * This is core java program for checking leap year
 * @author Sheetal
 * @since 2021-08-08
 */
public class LeapYear {
	
		int year;
		/**
		 * Method to check condition for leap year
		 * using while loop and for loops
		 * ensuring input no is a 4 digit no
		 * and printing whether input is a leap year or not
		 */
		void LeapYearOrNot()
		{
			int count = 0; int digits = year;
			while (digits != 0)
			{
				digits = digits / 10;
				count +=1;
			}
			if (count == 4 && year > 999 && year < 9999 )
			{
				if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0)))
				{
					System.out.println(year+" is a Leap Year");
				} else System.out.println(year+ " is not a Leap Year");
			}else System.out.println("Invalid format. Please enter year in YYYY format");
		}
		/**
		 * Main method where
		 * we are printing the welcome message
		 * and calling the above method
		 */
		public static void main(String[] args) {
			System.out.println("Program to check whether given year is Leap Year or not");
			Scanner sc = new Scanner(System.in);
			LeapYear myObj = new LeapYear();
			myObj.year = sc.nextInt();
			sc.close();
			myObj.LeapYearOrNot();
			
		}
}
