package chapter_1_strings.attempt2;

public class Q09_joiung_multiple_strings_with_delimiter {
	
	// write a program that joins the given strings by the
	// given delimiter
	
	static String joinStrings(String[] strings, String delimiter) {
		StringBuilder result = new StringBuilder();
		for (String str: strings) {
			result.append(str).append(delimiter);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String[] strings = {"hi","my", "name", "is", "Shiv"};
		System.out.println(joinStrings(strings, " "));
	}
	

}
