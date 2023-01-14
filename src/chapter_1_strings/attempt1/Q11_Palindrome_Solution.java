package chapter_1_strings.attempt1;

public class Q11_Palindrome_Solution {
	
	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString() );
	}
	
	public static boolean isPalindrome1(String str) {
		for (int i =0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("yooooy"));
		System.out.println(isPalindrome1("yooooy"));
	}

}
