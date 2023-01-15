package chapter_1_strings.attempt2;

public class Q11_check_if_palindrome {
	
	// write a program which check if string is palindrome
	
	static boolean isPalindrome(String str) {
		if (str.equals(new StringBuilder(str).reverse().toString())) 
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("oo")); // true
		System.out.println(isPalindrome("o")); // true
		System.out.println(isPalindrome("hot")); // false
		System.out.println(isPalindrome("tot")); // true
		System.out.println(isPalindrome("toot")); // true
	}
}
