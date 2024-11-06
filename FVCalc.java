// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int initialAmount = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double total = initialAmount * Math.pow(1 + interest / 100, years);
		System.out.println("After " + years + " years, a $" + initialAmount + " saved at " + interest + "% will yield $"
				+ (int) total);
	}
}