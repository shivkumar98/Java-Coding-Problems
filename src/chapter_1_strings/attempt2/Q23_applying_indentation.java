package chapter_1_strings.attempt2;

public class Q23_applying_indentation {
	
	// write snippets which apply index to given text
	
	public static void main(String[] args) {
		String text = "hello world!";
		String indented = "\t"+text;
	}

}
class Solution23 {
	public static void main(String[] args) {
		// this is for JDK12
		// Assume we have the following String:
		String days = "Sunday\n"
				 + "Monday\n"
				 + "Tuesday\n"
				 + "Wednesday\n"
				 + "Thursday\n"
				 + "Friday\n"
				 + "Saturday";
		// we can apply an indentation of 10 spaces:
		// System.out.println(days.indent(10));
	}
}