package Chapter_1_Strings;

public class Q04_CheckingIfStringContainsDigits_Solution {

	
	/*Checking whether a string contains only digits: Write a program that
checks whether the given string contains only digits
	 */
	
	/* book solution is mostly the same, but instead uses isDigit
	 * rather than regex
	 */
	
	static boolean containsOnlyDigits(String str) {
		for (int i=0; i<str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(containsOnlyDigits("120902193")); // true
		System.out.println(containsOnlyDigits("£deefj34")); // false
	}
	
}
