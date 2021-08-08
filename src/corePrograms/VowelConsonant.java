package corePrograms;

import java.util.Scanner;

/**
 * This is core java program to Check Whether an Alphabet is Vowel or Consonant
 * @author Sheetal
 * @since 2021-08-08
 */
public class VowelConsonant {
	/**
	 * this is the main method which
	 * takes an alphabet from user
	 * uses switch case to check for vowel or consonant
	 * and prints the result
	 */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = s.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet + " is vovel");
                break;
            default:
                System.out.println(alphabet + " is consonant");
        }

    }
}
