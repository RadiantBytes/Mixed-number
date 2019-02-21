
/**
 * This program divides two user-provided integers and converts the improper fraction into a mixed number
 * 
 * Last Modified: September 26 2016,
 * @author: Thomas Lyanugh
 */
import java.util.Scanner;

public class MixedNumbers {

	public static void main(String[] args) {
		// Declares new scanner
		Scanner scan = new Scanner(System.in);

		// Print prompt for numerator
		System.out.print("Enter the numerator: ");
		int numerator = scan.nextInt();

		// Print prompt for denominator
		System.out.print("Enter the denominator: ");
		int denominator = scan.nextInt();

		// Divide numerator and denominator into a mixed number
		String mixedNumber = (numerator / denominator) + " " + (numerator % denominator) + "/" + denominator;

		// Print mixed number
		System.out.print("## " + numerator + "/" + denominator + " = " + mixedNumber);

	}

}
