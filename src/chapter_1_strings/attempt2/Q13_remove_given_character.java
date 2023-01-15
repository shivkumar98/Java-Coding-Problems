package chapter_1_strings.attempt2;

public class Q13_remove_given_character {
	
	static String removeCharacter(String str, char ch) {
		char[] chArr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		for (char c: chArr) {
			if (c!=ch) {
				result.append(c);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeCharacter("hello", 'l')); // heo
	}

}
