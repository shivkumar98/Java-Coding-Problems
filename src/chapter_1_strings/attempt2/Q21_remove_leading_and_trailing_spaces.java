package chapter_1_strings.attempt2;

public class Q21_remove_leading_and_trailing_spaces {
	
	static String removeLeadingAndTrailingSpaces(String str) {
		String result = str.replaceAll("^[ ]*", "").replaceAll("[ ]+$","");
		return '"'+ result + '"';
	}
	
	public static void main(String[] args) {
		System.out.println(removeLeadingAndTrailingSpaces("  hi"));
		System.out.println(removeLeadingAndTrailingSpaces("   hi my name is Shiv  "));
	}
}

class Solution21 {
	// The String class has a trim method!
	public static void main(String[] args) {
		String text = "\t \n hello \r";
		String trimmed = text.trim();
	}
}