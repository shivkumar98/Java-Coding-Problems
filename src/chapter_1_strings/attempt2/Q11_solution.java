package chapter_1_strings.attempt2;

import java.util.stream.IntStream;

public class Q11_solution {
	
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
