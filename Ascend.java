// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int number1 = (int) (Math.random() * limit);
		int number2 = (int) (Math.random() * limit);
		int number3 = (int) (Math.random() * limit);
		int lowest = Math.min(Math.min(number1, number2), number3);
		int highest = Math.max(Math.max(number1, number2), number3);
		int mid = number1 + number2 + number3 - lowest - highest;
		System.out.println(number1 + " " + number2 + " " + number3);
		System.out.println(lowest + " " + mid + " " + highest);
	}
}
