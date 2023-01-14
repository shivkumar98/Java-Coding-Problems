package chapter_1_strings.attempt2;

public class Q04_solution {
	
	// solution 1:
	static boolean containsOnlyDigits(String str) {
		for (int i=0;i<str.length();i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}
	
	// solution 2:
	static boolean contrainsOnlyDigits2(String str) {
		return !str.chars().anyMatch(i -> Character.isDigit(i));
	}
	
	// solution 3 is same as my solution!

}
