package Chapter_1_Strings;

public class Question_11_Palindrome {

	public static boolean isPalindrome(String str) {
		boolean isPalindrome = true;
		for (int i =0; i< str.length()/2; i++) {
			if (str.charAt(i) == str.charAt(str.length()-i-1)) {
				continue;
			} else {
				return false;
			}
		}
		return isPalindrome;

	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("hello")); // true
		System.out.println(isPalindrome("helleh")); // true
		System.out.println(isPalindrome("iPi")); // true
		System.out.println(isPalindrome("woOw")); // false
		System.out.println(isPalindrome("yooooy"));
	}

}
