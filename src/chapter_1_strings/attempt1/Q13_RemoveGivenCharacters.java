package chapter_1_strings.attempt1;

public class Q13_RemoveGivenCharacters {
	
	/*
	 * Write a program that removes the given
		character from the given string
	 */
	
	public static String removeCharacter(char c, String str) {
		
		return str.replace(String.valueOf(c), "");
		
	}
	
	public static void main(String[] args) {
		System.out.println(removeCharacter('x', "tex mex")); // te me
	}

}
