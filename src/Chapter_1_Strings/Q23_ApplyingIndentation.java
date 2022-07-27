package Chapter_1_Strings;
/*
 * 23. Applying indentation: Write several snippets of code to apply indentation
	to the given text.
 */
public class Q23_ApplyingIndentation {

	static String string = "some text with no indentation";
	
	public static void main(String[] args) {
		string =  "\t" + string;
		System.out.println(string);
	}
	
}
