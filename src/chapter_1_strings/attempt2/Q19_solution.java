package chapter_1_strings.attempt2;

public class Q19_solution {
	 // in Java 13 we can use triple quotations
	public static void main(String[] args) {
		/// in JDK 8, we can use a Line separator
		// we can use the String's join() method
		String multilineText = String.join(System.lineSeparator(),
				"this is line 1", "my name is shiv", "final line");
		System.out.println(multilineText);
	}
}
