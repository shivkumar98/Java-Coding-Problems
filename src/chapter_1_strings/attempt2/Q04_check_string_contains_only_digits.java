package chapter_1_strings.attempt2;

public class Q04_check_string_contains_only_digits {
	
	// write a program which checks whether a given strin contains only digits
	
	static boolean containsOnlyDigits(String str) {
		if (str.matches("[0-9]+")) return true;
		return false;
	}
	
	public static void main(String[] args) {
		String str = "7";
		String str2 = "a7";
		String str3 = "7 ";
		System.out.println(containsOnlyDigits(str)); // expect true
		System.out.println(containsOnlyDigits(str2)); // expect false
		System.out.println(containsOnlyDigits(str3)); // expect false

	}

}

class Solution4 {
	
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