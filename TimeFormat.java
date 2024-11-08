// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0].
		//
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit.
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hoursInput = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4); // minutes should not be changed
		int hoursOutput = hoursInput > 12 ? hoursInput - 12 : hoursInput;
		String suffix = hoursInput % 12 != hoursInput ? "PM" : "AM";
		System.out.println(hoursOutput + ":" + minutes + " " + suffix);
	}
}