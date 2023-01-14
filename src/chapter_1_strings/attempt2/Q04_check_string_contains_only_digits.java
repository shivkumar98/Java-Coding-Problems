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
