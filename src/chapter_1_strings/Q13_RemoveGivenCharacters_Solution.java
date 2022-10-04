package chapter_1_strings;

import java.util.regex.Pattern;

public class Q13_RemoveGivenCharacters_Solution {

	public static String removeCharacter(String str, char c) {
		return str.replaceAll(Pattern.quote(String.valueOf(c)), "");
	}
	// this method relies on regex to escape special characters
	
	// here's a method which does not rely on regex:
	
	public static String removeCharacterV2(String str, char c) {
		StringBuilder sb = new StringBuilder();
		
		char[] charArray = str.toCharArray();
		
		for (char chars: charArray) {
			if (chars!=c) {
				sb.append(chars);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeCharacterV2("helooo", 'o')); // hel
	}
}
