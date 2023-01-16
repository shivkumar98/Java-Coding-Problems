package chapter_1_strings.attempt2;

public class Q07_convert_string_to_number {
	
	// Q07: write a program that converts a string representing a number
	// into int, long, float, or double
	
	static Number convertToNumber(String str) {
		if (str.matches("[0-9]+")) {
			return Long.valueOf(str);
		} else
			return Float.valueOf(str);
	}
	
	public static void main(String[] args) {
		System.out.println(convertToNumber("1")); // 1
		System.out.println(convertToNumber("1.2")); // 1.2
	}
}

class Solution7 {
	

	// we can then convert these to their primitive form:
	
	public static void main(String[] args) {
		// Let's consider the following strings
		String TO_INT = "453";
		String TO_LONG = "452222645";
		String TO_FLOAT = "45.823F";
		String TO_DOUBLE = "13.83894D";
		
		int toInt = Integer.parseInt(TO_INT);
		long toLong = Long.parseLong(TO_LONG);
		float toFloat = Float.parseFloat(TO_FLOAT);
		double toDouble = Double.parseDouble(TO_DOUBLE);
		
		//  if a string isn't in the correct format,
		//  then Java will throw a NumberFormatException
		
		try {
			Integer.parseInt("373.23w");
		} catch (NumberFormatException e)
		{
			System.out.println("invalid format: "+ e); // invalid format: java.lang.NumberFormatException: For input string: "373.23w"
		}

	}
	
}
