package Chapter_1_Strings;

public class Q21_RemoveWhiteSpace {

	/*
	 *  Removing leading and trailing spaces: 
	 *  Write a program that removes the
		leading and trailing spaces of the given string.
	 */
	
	static String removeTrailingWhitespace(String str) {
		return str.trim();
	}
	
	public static void main(String[] args) {
		String whitespaceText = "  fspewdjfep  o  ";
		System.out.println(removeTrailingWhitespace(whitespaceText));
		// "fspewdjfep  o"
	}
	
	// JDK11 offers a strip method for strings which works with unicode
}
