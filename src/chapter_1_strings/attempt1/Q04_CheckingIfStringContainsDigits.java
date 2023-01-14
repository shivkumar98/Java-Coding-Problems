package chapter_1_strings.attempt1;

public class Q04_CheckingIfStringContainsDigits {

	/*Checking whether a string contains only digits: Write a program that
checks whether the given string contains only digits
	 */
	
	static boolean containsOnlyDigits(String str) {
		String[] splitString = str.split("");
		for (int i =0; i < splitString.length; i ++) {
			if (!splitString[i].matches("[0-9]+")){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(containsOnlyDigits("1e2323")); // false
		System.out.println(containsOnlyDigits("00000")); // true
	}
	
	
}
