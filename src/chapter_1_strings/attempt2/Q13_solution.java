package chapter_1_strings.attempt2;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Q13_solution {

	// solution 1:
	// we can use the replaceAll() method
	static String removeCharacter(String str, char ch) {
		return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
	}
	
	// solution 2:
	// same as my solution:
	static String removeCharacter2(String str, char ch) {
		 StringBuilder sb = new StringBuilder();
		 char[] chArray = str.toCharArray();
		 for (char c : chArray) {
			 if (c != ch) {
				 sb.append(c);
			 }
		 }
		 return sb.toString();
	}
	
	// solution 3:
	static String removeCharacter3(String str, char ch) {
		return str.chars()
				.filter(i->i!=ch)
				.mapToObj(i-> String.valueOf((char) i))
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		System.out.println(removeCharacter("hello", 'l'));
		System.out.println(removeCharacter3("hello", 'l'));
	}
}
