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
