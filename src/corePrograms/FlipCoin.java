package corePrograms;

import java.util.Scanner;

/**
 * This is core java program for flip coin
 * @author Sheetal
 * @since 2021-08-08
 */
public class FlipCoin {
	/**
	 * This is the main method which
	 * takes no of times coin flipped as input
	 * use random function to get value and
	 * and gives percentage of Head vs tail as output
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many times u want to toss a coin: ");
        int coinToss = s.nextInt();
        if (coinToss > 0) {
            int i = 1;
            int headCount = 0;
            int tailCount = 0;
            while (i <= coinToss) {
                double random = Math.random();
                if (random < 0.5) {
                    //System.out.println("Tail");
                } else {
                    //System.out.println("Head");
                    headCount++;
                }
                i++;
            }
            System.out.println("Head count = " + headCount);
            tailCount = coinToss - headCount;
            System.out.println("Tail count = " + tailCount);
            double headPercentage = (headCount*100.0)/coinToss;
            System.out.printf("Head percentage = %.2f %n", headPercentage);
            double tailPercentage = 100 - headPercentage;
            System.out.printf("Tail percentage = %.2f %n ", tailPercentage);

        } else {
            System.out.println("Enter positive number.");
        }
    }

}
