package chapter_1_strings.attempt2;

import java.util.stream.IntStream;

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

class Solution11 {
	
	// solution 1
	static boolean isPalindrome(String str) {
		int left =0;
		int right = str.length()-1;
		while (right>left) {
			if (str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++; right++;
		}
		return true;
	}
	
	// solution 2:
	static boolean isPalindrome2(String str) {
		for (int i=0;i<str.length()/2;i++) {
			if (str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}
	
	// solution 3:
	static boolean isPalindrome3(String str) {
		 return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	// solution 4:
	static boolean isPalindrome4(String str) {
		return IntStream.range(0, str.length()/2)
				.noneMatch(i-> str.charAt(i)!= str.charAt(str.length()-1-i));
	}


}