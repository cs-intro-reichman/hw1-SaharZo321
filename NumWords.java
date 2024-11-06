// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds = number / 100;
		number -= hundreds * 100;
		int tens = number / 10;
		number -= tens * 10;
		int ones = number;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones. ");
	}
}
