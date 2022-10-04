package chapter_1_strings;

public class Q19_DeclareMultilineStrings_Solution {
	
	// in JDL 13,
	// we can writ multiline strings as literals using triple quotations
	/*
	 * String text = """My high school,
the Illinois Mathematics and Science Academy,
showed me that anything is possible
and that you're never too young to think big.""";

	 */
	
	// in JDK8, we have access to the lineSeperator in System class
	static String LS = System.lineSeparator();
	
	static String text = "this is the first line" + LS + "this is the second"
			+ LS + "this is the third";
	public static void main(String[] args) {
		System.out.println(text);
	}
}
