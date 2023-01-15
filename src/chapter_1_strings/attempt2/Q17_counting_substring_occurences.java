package chapter_1_strings.attempt2;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Q17_counting_substring_occurences {

	// count the occurences of a string in another string
	static int countOccurences(String text, String subtext) {
		String[] split = text.split(Pattern.quote(subtext));
		return split.length-1;
	}
	
	public static void main(String[] args) {
		System.out.println(countOccurences("hellohellisbadhellington", "hell")); // 3
		System.out.println(countOccurences("hellohellisbadhellington", "xyz")); // 3
		System.out.println(countOccurences("hello","hell")); // 1
	}
}
